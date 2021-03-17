package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class prendas implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
	return UIprendas.TITULO_COMPARACIONES.resolveFor(actor).isEnabled();

	}
	
	public static prendas compara() {
		return new prendas();
	}
}