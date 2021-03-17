package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIcatalogoSecundario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class EntreCatalogos implements Task {

	@Step
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Scroll.to(UIcatalogoSecundario.BOX_CATALOGO),
				Click.on(UIcatalogoSecundario.BTN_MAS_VENDIDOS),
				Click.on(UIcatalogoSecundario.BTN_POPULAR),
				Click.on(UIcatalogoSecundario.BTN_MAS_VENDIDOS),
				Click.on(UIcatalogoSecundario.BTN_POPULAR));
		}

	public static EntreCatalogos desplazarse () {
		return Tasks.instrumented(EntreCatalogos.class);
	}
}