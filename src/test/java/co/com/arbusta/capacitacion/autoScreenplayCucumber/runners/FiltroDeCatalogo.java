package co.com.arbusta.capacitacion.autoScreenplayCucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/FiltroDeCatalogo.feature",
        glue = {"co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions"},
        snippets = SnippetType.UNDERSCORE)
public class FiltroDeCatalogo {

}
