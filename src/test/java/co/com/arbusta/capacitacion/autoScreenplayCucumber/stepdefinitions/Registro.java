package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.Signout;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.camposIncorrectos;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Registrarse;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Registro {
	
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UIregistro page;
	
	Actor Cristian = Actor.named("Cristian");

	private String email = "loremum2@gmail.com";
	private String passwd = "12345678";
	
	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
	}
	
    @Given("^que el navegante se encuentra en la pagina automationpractice$")
    public void que_el_navegante_se_encuentra_en_la_pagina_automationpractice() {
    	Cristian.attemptsTo(IrA.automationPractice(page));
    }

    @When("^el navegante se registra incorrectamente$")
    public void el_navegante_se_registra_incorrectamente() {
    	Cristian.attemptsTo(Registrarse.comoUsuario(email,passwd,Cristian.getName(),"0"));
    }

    @Then("^el proceso de ingreso marca los campos de error$")
    public void el_proceso_de_ingreso_marca_los_campos_de_error() {
    	Cristian.asksFor(camposIncorrectos.muestra());
    }

    @When("^el navegante se registra correctamente$")
    public void el_navegante_se_registra_correctamente() {
    	Cristian.attemptsTo(Registrarse.comoUsuario(email,passwd,Cristian.getName(),"15302"));
    }
    
    @Then("^se crea un usuario$")
    public void se_crea_un_usuario() {
    	Cristian.asksFor(Signout.estaPresente());
    }
}
