
package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.faltaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.maxPrendas;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.prendas;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.PrimeraPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.compara;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.cuartaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.segundaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CompararPrendas {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UIprendas page;
	Actor Cristian = Actor.named("Cristian");
	
	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
        
    @Given("^ingreso a la pagina principal$")
    public void ingreso_a_la_pagina_principal() {
    	Cristian.attemptsTo(IrA.automationPractice(page));
    }

    // selecciono una prenda
    
    @When("^selecciono una prenda$")
    public void selecciono_una_prenda() {
    	Cristian.attemptsTo(PrimeraPrenda.seleccionar("Dresses"));
    	Cristian.attemptsTo(compara.prenda());
    }
    
    @Then("^se visualiza un cartel advirtiendo que falta otra prenda$")
    public void se_visualiza_un_cartel_advirtiendo_que_falta_otra_prenda() {
    	Cristian.asksFor(faltaPrenda.advierte());
    }
    
    // selecciono dos prendas
    
    @When("^selecciono dos prendas$")
    public void selecciono_dos_prendas() {
    	Cristian.attemptsTo(PrimeraPrenda.seleccionar("Dresses"));
    	Cristian.attemptsTo(segundaPrenda.selecciona());
    	Cristian.attemptsTo(compara.prenda());
    }
    
    @Then("^se visualiza una columna por prenda con la informacion respectiva$")
    public void se_visualiza_una_columna_por_prenda_con_la_informacion_respectiva() {
    	Cristian.asksFor(prendas.compara());
    }

    // selecciono cuatro prendas
    
    @When("^selecciono cuatro prendas$")
    public void selecciono_cuatro_prendas() {
    	Cristian.attemptsTo(PrimeraPrenda.seleccionar("Dresses"));
    	Cristian.attemptsTo(segundaPrenda.selecciona());
    	Cristian.attemptsTo(cuartaPrenda.selecciona());
    }

    @Then("^despliega cartel bloqueante$")
    public void despliega_cartel_bloqueante() {
    	Cristian.asksFor(maxPrendas.advierte());
    }
}
	
  
