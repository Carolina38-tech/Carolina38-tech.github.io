package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.resultadosFiltro;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.filtro;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIfiltros;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class FiltroDeCatalogo {
	
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UIfiltros page;
	
	Actor Cristian = Actor.named("Cristian");

	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
    @Given("^que el usuario se encuentra en el catalogo de automationpractice$")
    public void que_el_usuario_se_encuentra_en_el_catalogo_de_automationpractice() {
    	Cristian.attemptsTo(IrA.automationPractice(page));
    }

    @When("^el usuario realiza un filtro$")
    public void el_usuario_realiza_un_filtro() {
    	Cristian.attemptsTo(filtro.realiza());
    }

    @Then("^se muestran los resultados de la busqueda con el filtro$")
    public void se_muestran_los_resultados_de_la_bsqueda_con_el_filtro() {
    	Cristian.asksFor(resultadosFiltro.seVisualizan());
    } 
}
