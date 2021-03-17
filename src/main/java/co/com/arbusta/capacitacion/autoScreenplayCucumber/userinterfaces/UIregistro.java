package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class UIregistro extends PageObject {

	public static final Target BTN_SingIn = Target.the("Boton de login").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	public static final Target CMP_email = Target.the("Boton de login").located(By.id("email_create"));
	public static final Target BTN_Crea_una_cuenta = Target.the("Boton de login").located(By.id("SubmitCreate"));

	//registro
	
	public static final Target BTN_Genero_hombre = Target.the("Boton de login").located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label"));
	public static final Target CMP_nombre = Target.the("Boton de login").located(By.id("customer_firstname"));
	public static final Target CMP_apellido = Target.the("Boton de login").located(By.id("customer_lastname"));
	public static final Target CMP_passwd = Target.the("Boton de login").located(By.id("passwd"));
	public static final Target DRP_dias = Target.the("Boton de login").located(By.id("days"));
	public static final Target DRP_dia_4 = Target.the("Boton de login").located(By.xpath("//*[@id=\"days\"]/option[5]"));
	public static final Target DRP_meses = Target.the("Boton de login").located(By.id("months"));
	public static final Target DRP_junio = Target.the("Boton de login").located(By.xpath("//*[@id=\"months\"]/option[7]"));
	public static final Target DRP_anios = Target.the("Boton de login").located(By.id("years"));
	public static final Target DRP_1996 = Target.the("Boton de login").located(By.xpath("//*[@id=\"years\"]/option[27]"));
	public static final Target CMP_nombre2 = Target.the("Boton de login").located(By.id("firstname"));
	public static final Target CMP_apellido2 = Target.the("Boton de login").located(By.id("lastname"));
	public static final Target CMP_direccion = Target.the("Boton de login").located(By.id("address1"));
	public static final Target CMP_ciudad = Target.the("Boton de login").located(By.id("city"));
	public static final Target CMP_codigo_postal = Target.the("Boton de login").located(By.id("postcode"));
	public static final Target DRP_estado = Target.the("Boton de login").located(By.id("id_state"));
	public static final Target DRP_Alabama = Target.the("Boton de login").located(By.xpath("//*[@id=\"id_state\"]/option[2]"));
	public static final Target CMP_movil = Target.the("Boton de login").located(By.id("phone_mobile"));

	public static final Target BTN_registarse = Target.the("Boton de login").located(By.id("submitAccount"));
	public static final Target BTN_cerrar_sesion = Target.the("Boton de login").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	public static final Target BOX_errores_en_campos = Target.the("Cartel de errores en campos").located(By.xpath("//*[@id=\"center_column\"]/div"));
	public static final Target BOX_authentication = Target.the("caja de autentificacion").located(By.xpath("//*[@id=\"columns\"]/div[3]"));
}
