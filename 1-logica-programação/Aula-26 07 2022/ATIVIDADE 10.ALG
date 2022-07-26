Algoritmo "atividade 10"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
   // Seção de Declarações das variáveis
   pesoideal,altura:real

   sexo:caractere


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   // Não funciona


   escreval("Qual seu sexo?")
   leia(sexo)

   escreval("Qual sua altura?")
   leia(altura)

   se (sexo = ("homem"))entao
      (pesoideal):= ((72.7* altura)- 58)
   fimse
   
   se (sexo = ("mulher"))entao
      (pesoideal):= ((62.1* altura)– 44.7)
   fimse

   escreval("Esse é seu peso ideal: ", pesoideal)

Fimalgoritmo