package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class UImenuCategorias extends PageObject {

	public static final Target DRP_WOMEN= Target.the("Desplegable a seccion Mujer").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	public static final Target DRP_BLOUSES = Target.the("Boton a subseccion de blusas").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
	public static final Target  BOX_TITULO_DE_SECCION = Target.the("Boton a subseccion de blusas").located(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/span"));
	
	

}
