package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber-report"}, //plugin apresenta no console cada passo executado pelo cucumber
		features = "src/test/resources/features", //Caminho onde as features est�o
		glue = "stepsDefinitions", //Pacote que cont�m os StepsDefinitions
		//tags = "@comprarCredito",
		snippets = SnippetType.CAMELCASE, //converte o nome dos m�todos criados para o padrao camel case
		monochrome = true, //define a cor da fonte apresentada no console no padr�o monocrom�tico
		dryRun = false // quando True Apenas gera o teste e n�o o executa de fato, reduzindo o tempo de teste pr�vio 
		)

public class RunnerTest {

}
