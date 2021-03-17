package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class UIbarraDeBusqueda extends PageObject{

	public static final Target CMP_Barra_Busqueda = Target.the("Barra de busqueda").located(By.xpath("//*[@id=\"search_query_top\"]"));
	public static final Target BTN_Barra_Busqueda = Target.the("Boton de barra de busqueda").located(By.xpath("//*[@id=\"searchbox\"]/button"));
	public static final Target OBJ_msj_resultados_busqueda = Target.the("Descripcion de cantidad de resultados de la busqueda").located(By.xpath("//*[@id=\"center_column\"]/h1/span[2]"));
	public static final Target OBJ_msj_resultados_busqueda_0 = Target.the("Descripcion de cantidad de resultados de la busqueda").located(By.xpath("//*[@id=\"center_column\"]/h1/span"));

}