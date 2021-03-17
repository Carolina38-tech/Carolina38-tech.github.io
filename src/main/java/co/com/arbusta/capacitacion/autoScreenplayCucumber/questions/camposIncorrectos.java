package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class camposIncorrectos implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {

	return UIregistro.BOX_errores_en_campos.resolveFor(actor).isEnabled();
	}
	
	public static camposIncorrectos muestra() {
		return new camposIncorrectos();
	}

}

