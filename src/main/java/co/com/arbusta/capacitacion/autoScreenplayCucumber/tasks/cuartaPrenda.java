package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class cuartaPrenda implements Task {

	public  cuartaPrenda () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(UIprendas.BOX__TERCER_PRENDA),
				Click.on(UIprendas.TERCER_PRENDA),
				Scroll.to(UIprendas.BOX__CUARTA_PRENDA),
				Click.on(UIprendas.BOX__CUARTA_PRENDA),
				Click.on(UIprendas.CUARTA_PRENDA)
			);
	}
	
	public static cuartaPrenda selecciona() {
		return Tasks.instrumented(cuartaPrenda.class);
	}
	
}