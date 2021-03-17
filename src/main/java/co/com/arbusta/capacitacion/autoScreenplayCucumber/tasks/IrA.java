package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IrA implements Task{

	private PageObject pageAP;

	public IrA(PageObject page) {
		this.pageAP = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pageAP)); 
	}

	public static IrA automationPractice(PageObject page) {
		return Tasks.instrumented(IrA.class, page);
	}
}
