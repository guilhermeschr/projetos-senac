Algoritmo "atividade 10"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
   // Se��o de Declara��es das vari�veis
   pesoideal,altura:real

   sexo:caractere


Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...


   // N�o funciona


   escreval("Qual seu sexo?")
   leia(sexo)

   escreval("Qual sua altura?")
   leia(altura)

   se (sexo = ("homem"))entao
      (pesoideal):= ((72.7* altura)- 58)
   fimse
   
   se (sexo = ("mulher"))entao
      (pesoideal):= ((62.1* altura)� 44.7)
   fimse

   escreval("Esse � seu peso ideal: ", pesoideal)

Fimalgoritmo