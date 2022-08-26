package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//cenario1
	@FindBy(xpath  = "//a[@href=\"http://www.dataprom.com\"]")
	private WebElement linkIniciarSessao;
	
	public void clicarLinkIniciarSessao() {
		linkIniciarSessao.click();
	}
	
	//cenario2
	@FindBy(name = "nomeUsuario")
	private WebElement loginUsuario;
	
	@FindBy(name = "senha")
	private WebElement senhaUsuario;
	
	@FindBy(xpath = "//input[@class=\"botaoSubmit\"]")
	private WebElement botaoEntrar;
	
	public void informarLoginCampoLogin(String login) {
		loginUsuario.sendKeys(login);
	}
	
	public void informarSenhaCampoSenha(String senha) {
		senhaUsuario.sendKeys(senha);
	}
	
	public void clicarBotaoEntrar() {
		botaoEntrar.click();
	}
	
	public void realizaLogin(String login, String senha) {
		loginUsuario.sendKeys(login);
		senhaUsuario.sendKeys(senha);
		botaoEntrar.click();
	}

}
