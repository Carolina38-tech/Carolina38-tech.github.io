package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Categoria implements Task{

	public Categoria () {}

	@Step("{0} selecciona una categoria del menu")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(UImenuCategorias.DRP_WOMEN)); 
	}
	
	public static Categoria selecciona() {
		return Tasks.instrumented(Categoria.class);
	}
	
}