#language: pt
#enconding: UTF-8
@comprarCredito
Funcionalidade: Comprar Creditos para pessoa fisica

@cenario3
Cenario: comprar creditos
	Quando eu clicar no link comprar creditos pessoa fisica
	E eu informar no campo cpf o cpf ""
	E eu clicar no botao localizar
	E informar no campo valor o valor "" 
	E clicar no botao proceguir
	E clicar no botao finalizar compra
	Entao o sistema ira exibir a tela 