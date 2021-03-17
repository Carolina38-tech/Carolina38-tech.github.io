package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.BannerCategoria;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.BannerSubCategoria;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Categoria;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Subcategoria;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CategoriasEnMenu {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UImenuCategorias page;
	
	Actor Cristian = Actor.named("Cristian");

	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
    @Given("^que el usuario ingresa a automationpractice$")
    public void que_el_usuario_ingresa_a_automationpractice() {
    	Cristian.attemptsTo(IrA.automationPractice(page));
    }

    @When("^el usuario selecciona una categoria del menu$")
    public void el_usuario_selecciona_una_categoria_del_menu() {
    	Cristian.attemptsTo(Categoria.selecciona());
    }

    @Then("^se despliega el menu con los productos de la categoria$")
    public void se_despliega_el_menu_con_los_productos_de_la_categoria() {
    	Cristian.asksFor(BannerCategoria.correspondeAlIngresado());
    }
    
    @When("^el usuario selecciona una subcategoria del menu$")
    public void el_usuario_selecciona_una_subcategoria_del_menu() {
    	Cristian.attemptsTo(Subcategoria.selecciona());
    }

    @Then("^se despliega el menu con los productos de la subcategoria$")
    public void se_despliega_el_menu_con_los_productos_de_la_subcategoria() {
    	Cristian.asksFor(BannerSubCategoria.correspondeAlIngresado());
    }
}
