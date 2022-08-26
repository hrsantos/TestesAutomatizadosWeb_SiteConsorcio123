package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	//Cenario1
	@Quando("^eu clicar no link Iniciar sessao$")
	public void euClicarNoLinkIniciarSessao() throws Throwable {
		NaTela(LoginPage.class).clicarLinkIniciarSessao();
	}



	@Entao("^o sistema apresenta a tela login$")
	public void oSistemaApresentaATelaLogin() throws Throwable {
		
	}
	
	
	//Cenario2
	@Dado("que eu estou na pagina de login")
	public void queEuEstouNaPaginaDeLogin() {
	   
	}

	@Quando("eu informar o login {string}")
	public void euInformarOLogin(String login) {
		NaTela(LoginPage.class).informarLoginCampoLogin(login);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    NaTela(LoginPage.class).informarSenhaCampoSenha(senha);
	}

	@Quando("clicar no botao entrar")
	public void clicarNoBotaoEntrar() {
	    NaTela(LoginPage.class).clicarBotaoEntrar();
	}

	@Entao("a tela principal e apresentada")
	public void aTelaPrincipalEApresentada() {
	    assertEquals("HAROLDO RODRIGUES DOS SANTOS (33810674869)", driver.findElement(By.xpath("//div[@class=\"dadosLogado\"]")).getText());
	}



	

}
