Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
   // Se��o de Declara��es das vari�veis
   peso:real
   altura:real
   imc:real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...


   //N�o funciona
   
   
   
   escreval("Seu peso:")
   leia(peso)
   escreval("Sua altura:")
   leia(altura)

   imc:= ((peso)/((altura)*2))
   escreval("")
   escreval(imc)
   escreval("")

   se ((imc) <= 18.5) entao
      escreval("Abaixo do peso!")
   fimse
   se ((imc)> 18.5) e ((imc)< 25) entao
      escreval("Peso normal!")
   fimse
   se ((imc)=> 25) e ((imc)< 30) entao
      escreval("Acima do peso!")
   fimse
   se ((imc)=> 30) entao
      escreval("Obeso!")
   fimse


Fimalgoritmo