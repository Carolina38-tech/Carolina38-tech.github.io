package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class resultadosFiltro implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		return false;
	}
	
	public static resultadosFiltro seVisualizan() {
		return new resultadosFiltro();
	}



}