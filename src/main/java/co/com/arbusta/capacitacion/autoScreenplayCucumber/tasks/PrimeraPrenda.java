package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class PrimeraPrenda implements Task {
	
	private String producto;

	public PrimeraPrenda(String producto) {
		this.producto = producto;
	}
	
	@Step("{0} login para loguearse")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(producto).into(UIbarraDeBusqueda.CMP_Barra_Busqueda),
				Click.on(UIbarraDeBusqueda.BTN_Barra_Busqueda),
				Scroll.to(UIprendas.BOX_CONTENIDO),
				Click.on(UIprendas.BOX__PRIMER_PRENDA),
				Click.on(UIprendas.PRIMER_PRENDA)
		); }
	
	public static PrimeraPrenda seleccionar(String producto) {
		return Tasks.instrumented(PrimeraPrenda.class,producto);
	}
}

