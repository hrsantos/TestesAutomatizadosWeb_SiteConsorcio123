$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ComprarCreditos.feature");
formatter.feature({
  "name": "Comprar Creditos para pessoa fisica",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@comprarCredito"
    }
  ]
});
formatter.scenario({
  "name": "comprar creditos",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@comprarCredito"
    },
    {
      "name": "@cenario3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no link comprar creditos pessoa fisica",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarCreditosSteps.euClicarNoLinkComprarCreditosPessoaFisica()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar no campo cpf o cpf \"33810674869\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarCreditosSteps.euInformarNoCampoCpfOCpf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao localizar",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarCreditosSteps.euClicarNoBotaoLocalizar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo valor o valor \"20,00\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarCreditosSteps.informarNoCampoValorOValor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao proceguir",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarCreditosSteps.clicarNoBotaoProceguir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao finalizar compra",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarCreditosSteps.clicarNoBotaoFinalizarCompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema ira exibir a tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarCreditosSteps.oSistemaIraExibirATela()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Fazer login no site consorcio123",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "acessar pagina login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@cenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no link Iniciar sessao",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euClicarNoLinkIniciarSessao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a tela login",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaApresentaATelaLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "fazer login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@cenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o login \"33810674869\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euInformarOLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"Bosta#159\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a tela principal e apresentada",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.aTelaPrincipalEApresentada()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
});