package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_DE_TASANOMINAL_A_TASAEFECTIVA;
public class ClickTasaNominalAEfectivaTasks implements Task {

    public static ClickTasaNominalAEfectivaTasks clickTasaNominalAEfectiva() {
        return Tasks.instrumented(ClickTasaNominalAEfectivaTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DE_TASANOMINAL_A_TASAEFECTIVA).afterWaitingUntilEnabled()
        );
    }
}

