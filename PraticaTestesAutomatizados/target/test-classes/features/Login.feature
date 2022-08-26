#language: pt
#enconding: UTF-8
@login
Funcionalidade: Fazer login no site consorcio123

  @cenario1
  Cenario: acessar pagina login
    Quando eu clicar no link Iniciar sessao
    Entao o sistema apresenta a tela login
  
  @cenario2
  Cenario: fazer login
  	Quando eu informar o login ""
  	E informar a senha ""
  	E clicar no botao entrar
  	Entao a tela principal e apresentada
  	
  	
 
  
