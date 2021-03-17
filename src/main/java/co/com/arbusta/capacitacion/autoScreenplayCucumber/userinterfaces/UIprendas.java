package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class UIprendas extends PageObject {
	
	//Para las Tasks
	
	public static final Target BOX_CONTENIDO = Target.the("seccion de contenido").located(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]"));			
	public static final Target PRIMER_PRENDA = Target.the("Primer Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a"));
	public static final Target BOX__PRIMER_PRENDA = Target.the("Seccion de primer prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]"));
	public static final Target BTN_COMPARE = Target.the("Boton Comparar").located(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/form/button"));	
	public static final Target SEGUNDA_PRENDA = Target.the("Segunda Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a"));
	public static final Target BOX__SEGUNDA_PRENDA = Target.the("Seccion de segunda prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]"));
	public static final Target TERCER_PRENDA = Target.the("Tercer Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]/a"));
	public static final Target BOX__TERCER_PRENDA = Target.the("Seccion de tercer prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]"));
	public static final Target CUARTA_PRENDA = Target.the("Cuarta Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[3]/div[2]/a"));
	public static final Target BOX__CUARTA_PRENDA = Target.the("Seccion de cuarta prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[4]"));
	public static final Target BOX_COMPARE = Target.the("seccion donde muestran las prendas comparadas").located(By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]"));

	//Para las Questions
	
	public static final Target TITULO_COMPARACIONES = Target.the("Titulo de la seccion de comparacion").located(By.xpath("//*[@id=\"center_column\"]/h1"));	
	public static final Target POPUP_COMPARE_ADV = Target.the("Titulo de la seccion de comparacion").located(By.xpath("//*[@id=\"search\"]/div[2]/div/div/div/div/p"));

	
	
	

}

