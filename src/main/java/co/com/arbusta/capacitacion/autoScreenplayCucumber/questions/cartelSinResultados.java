package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class cartelSinResultados implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		return UIbarraDeBusqueda.OBJ_msj_resultados_busqueda_0.resolveFor(actor).isEnabled();
	}
	
	public static cartelSinResultados muestra() {
		return new cartelSinResultados();
	}
}