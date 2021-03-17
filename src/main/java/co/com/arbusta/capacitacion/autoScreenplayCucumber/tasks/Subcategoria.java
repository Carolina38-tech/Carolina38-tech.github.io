package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;

public class Subcategoria implements Task{

	public Subcategoria () {}

	@Step("{0} selecciona una subcategoria del menu")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				MoveMouse.to(UImenuCategorias.DRP_WOMEN),
				Click.on(UImenuCategorias.DRP_BLOUSES)
			);
	}
	
	public static Subcategoria selecciona() {
		return Tasks.instrumented(Subcategoria.class);
	}
	
}