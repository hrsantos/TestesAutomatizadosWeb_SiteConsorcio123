package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before() // define a��es que ser�o executadas antes do inicio dos testes, A anota��o pode conter parametros ex: (value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@Before(value = "@comprarCredito") // define a��es que ser�o executadas antes do inicio dos testes, A anota��o pode conter parametros ex: (value = "@login")
	public void setUp() {
		acessarSistema();
		NaTela(LoginPage.class).realizaLogin("33810674869", "Bosta#159");
		
	}
	
	@After()
	public void fechar(Scenario cenario) {
		capturarTela(cenario);
		driver.quit();
	}
	
	
	
	/*@After
	public void tearDown() {// define a��es que ser�o executadas depois do inicio dos testes
		//capturarTela(scenario); //Scenario passa como parametro o objeto respons�vel pelas prints dos testes 
		driver.quit();
	}*/
}
