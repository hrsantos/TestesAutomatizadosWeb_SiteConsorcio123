package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComprarCreditosPage {
	
	@FindBy(linkText = "Comprar Créditos para Pessoa Física")
	private WebElement compraPF;
	
	@FindBy(name = "documentoNacional")
	private WebElement cpfUsuario;
	
	@FindBy(name = "localizar")
	private WebElement botaoLocalizar;
	
	@FindBy(id = "quantidade1")
	private WebElement valorCreditos;
	
	@FindBy(xpath = "//input[@value=\"Prosseguir\"]")
	private WebElement botaoProsseguir;
	
	@FindBy(name = "finalizar")
	private WebElement botaoFinalizarCompra;
	
	@FindBy(name = "prosseguir")
	private WebElement botaoProsseguirFinal;
	
	public void clicarNoLinkComprarCreditosPessoaFisica() {
		//System.out.println(compraPF.getText());
		compraPF.click();
	}
	
	public void informarCpfUsuario(String cpf) {
		cpfUsuario.sendKeys(cpf);
	}
	
	public void clicarNoBotaoLocalizar() {
		botaoLocalizar.click();
	}
	
	public void informarValor(String valor) {
		valorCreditos.clear();
		valorCreditos.sendKeys(valor);
	}
	
	public void clicarNoBotaoProsseguir() {
		botaoProsseguir.click();
	}
	
	public void clicarNoBotaoFinalizarCompra() {
		botaoFinalizarCompra.click();
	}
	
	public void imprimirBoleto() {
		botaoProsseguirFinal.click();;
	}
	
	
}
