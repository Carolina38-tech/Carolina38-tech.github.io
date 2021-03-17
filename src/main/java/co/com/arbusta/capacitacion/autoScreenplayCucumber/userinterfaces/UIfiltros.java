package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?id_category=3&controller=category")

public class UIfiltros extends PageObject {

	public static final Target BTN_TALLE_S = Target.the("Talle S").located(By.id("layered_id_attribute_group_1"));
	public static final Target BTN_COLOR_NARANJA = Target.the("Color de prenda naranja").located(By.id("layered_id_attribute_group_13"));
	public static final Target BTN_TELA_ALGODON = Target.the("Tela de algodon").located(By.id("layered_id_feature_5"));
	public static final Target BTN_VALIDACION = Target.the("").located(By.xpath(""));

}

