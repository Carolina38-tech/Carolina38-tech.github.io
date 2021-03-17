package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class segundaPrenda implements Task {
	

	public segundaPrenda(){}
	
	@Step("{0} login para loguearse")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(

				Click.on(UIprendas.BOX__SEGUNDA_PRENDA),
				Click.on(UIprendas.SEGUNDA_PRENDA)
		); }
	
	public static segundaPrenda selecciona() {
		return Tasks.instrumented(segundaPrenda.class);
	}
}

