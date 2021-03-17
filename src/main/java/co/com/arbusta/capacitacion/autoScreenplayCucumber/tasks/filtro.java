package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIfiltros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class filtro implements Task {

	public  filtro () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(			
				Scroll.to(UIfiltros.BTN_COLOR_NARANJA),
				Click.on(UIfiltros.BTN_COLOR_NARANJA),
				Scroll.to(UIfiltros.BTN_TALLE_S),
				Click.on(UIfiltros.BTN_TALLE_S),
				Scroll.to(UIfiltros.BTN_TELA_ALGODON),
				Click.on(UIfiltros.BTN_TELA_ALGODON)
			);
	}
	
	public static filtro realiza() {
		return Tasks.instrumented(filtro.class);
	}

}