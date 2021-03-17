package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.cartelSinResultados;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.numerosDeResultado;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.producto;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BarraDeBusqueda {

		@Managed(driver = "chrome")
		public WebDriver driver;
		
		private UIbarraDeBusqueda page;
		
		Actor Cristian = Actor.named("Cristian");

	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
    @Given("^que el usuario se encuentra en la pagina de automationpractice$")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_automationpractice() {
    	Cristian.attemptsTo(IrA.automationPractice(page));   }
    
    //Escenario Exitoso
    
   @When("^el usuario busca un producto existente$")
   public void el_usuario_busca_un_producto_existente() {
	   Cristian.attemptsTo(producto.busca("Short Sleeve"));   }

   @Then("^se despliega el menu con los resultados de busqueda correspondientes$")
   public void se_despliega_el_menu_con_los_resultados_de_busqueda_correspondientes() {
	   Cristian.asksFor(numerosDeResultado.devuelveUn());
   }

   //Escenario Fallido
   
    @When("^el usuario realiza una busqueda inexistente$")
    public void el_usuario_realiza_una_busqueda_inexistente() {
    	Cristian.attemptsTo(producto.busca("Manual Screenplay y Cucumber")); }

    @Then("^se visualiza el menu vacio junto al mensaje sin resultados de busqueda$")
    public void se_visualiza_el_menu_vacio_junto_al_mensaje_sin_resultados_de_busqueda() {
    	Cristian.asksFor(cartelSinResultados.muestra());
    }
    
}
