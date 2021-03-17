package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class maxPrendas implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
	return UIprendas.POPUP_COMPARE_ADV.resolveFor(actor).isEnabled();
	}
	
	public static maxPrendas advierte() {
		return new maxPrendas();
	}
}