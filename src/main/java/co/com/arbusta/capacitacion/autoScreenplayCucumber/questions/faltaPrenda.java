package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class faltaPrenda implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		return false;
		
	}
	
	public static faltaPrenda advierte() {
		return new faltaPrenda();
	}
}