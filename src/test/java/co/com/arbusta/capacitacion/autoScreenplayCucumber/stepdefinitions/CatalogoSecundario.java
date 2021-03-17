package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.catalogoSecundario;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.EntreCatalogos;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIcatalogoSecundario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CatalogoSecundario {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UIcatalogoSecundario page;
	
	Actor Cristian = Actor.named("Cristian");

@Before
public void SetUp() {
	Cristian.can(BrowseTheWeb.with(driver));
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
    @Given("^que el usuario se encuentra en automationpractice$")
    public void que_el_usuario_se_encuentra_en_automationpractice() {
    	Cristian.attemptsTo(IrA.automationPractice(page));
    }

    @When("^el usuario selecciona un catalogo$")
    public void el_usuario_selecciona_un_catalogo() {
    	Cristian.attemptsTo(EntreCatalogos.desplazarse());
    }

    @Then("^se visualizan los productos correspondientes a la seccion$")
    public void se_visualizan_los_productos_correspondientes_a_la_seccion() {
    	Cristian.asksFor(catalogoSecundario.vuelveApupolar());
    }
}
