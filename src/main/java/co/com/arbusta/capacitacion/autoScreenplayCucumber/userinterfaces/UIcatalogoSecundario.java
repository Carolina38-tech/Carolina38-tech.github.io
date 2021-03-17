package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class UIcatalogoSecundario extends PageObject {

	public static final Target BOX_CATALOGO = Target.the("Seccion de catalogo de muestra").located(By.id("center_column"));
	public static final Target BTN_POPULAR = Target.the("catalogo popular").located(By.xpath("//*[@id=\"home-page-tabs\"]/li[1]/a"));
	public static final Target BTN_MAS_VENDIDOS = Target.the("catalogo mas vendidos").located(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a"));

}
