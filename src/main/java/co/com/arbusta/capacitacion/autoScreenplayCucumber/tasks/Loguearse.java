package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class Loguearse implements Task  {

		public static String email;
		public static String passwd;

		public Loguearse (String email, String passwd) {
			Loguearse.email = email;
			Loguearse.passwd = passwd;
		}

		@Step("{0} se loguea con datos correctos")
		public <T extends Actor> void performAs(T actor) {

			actor.attemptsTo(
					
							Click.on(UIlogin.BTN_SingIn),
							Scroll.to(UIlogin.BOX_sectorAuthentication),
							Enter.theValue(email).into(UIlogin.CMP_email),
							Enter.theValue(passwd).into(UIlogin.CMP_passwd),
							Click.on(UIlogin.BTN_SubmitLogin)			
					); }
		
		public static Loguearse correctamente(String email, String passwd) {
			return Tasks.instrumented(Loguearse.class,email,passwd);
		}
		
	}

