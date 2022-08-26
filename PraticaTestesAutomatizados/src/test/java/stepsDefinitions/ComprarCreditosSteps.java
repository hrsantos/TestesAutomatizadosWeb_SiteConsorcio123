package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ComprarCreditosPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ComprarCreditosSteps {


	@Quando("eu clicar no link comprar creditos pessoa fisica")
	public void euClicarNoLinkComprarCreditosPessoaFisica() {
		NaTela(ComprarCreditosPage.class).clicarNoLinkComprarCreditosPessoaFisica();
	}

	@Quando("eu informar no campo cpf o cpf {string}")
	public void euInformarNoCampoCpfOCpf(String cpf) {
		NaTela(ComprarCreditosPage.class).informarCpfUsuario(cpf);
	}

	@Quando("eu clicar no botao localizar")
	public void euClicarNoBotaoLocalizar() {
		NaTela(ComprarCreditosPage.class).clicarNoBotaoLocalizar();
	}

	@Quando("informar no campo valor o valor {string}")
	public void informarNoCampoValorOValor(String valor) {
		NaTela(ComprarCreditosPage.class).informarValor(valor);
	}

	@Quando("clicar no botao proceguir")
	public void clicarNoBotaoProceguir() {
		NaTela(ComprarCreditosPage.class).clicarNoBotaoProsseguir();
	}

	@Quando("clicar no botao finalizar compra")
	public void clicarNoBotaoFinalizarCompra() {
		NaTela(ComprarCreditosPage.class).clicarNoBotaoFinalizarCompra();
	}

	@Entao("o sistema ira exibir a tela")
	public void oSistemaIraExibirATela() {
		assertEquals("Bradesco", driver.findElement(By.xpath("//td[contains(text(),'Bradesco')]")).getText());
	}
}
