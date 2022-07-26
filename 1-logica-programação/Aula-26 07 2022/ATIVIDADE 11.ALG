Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
   // Seção de Declarações das variáveis
   peso:real
   altura:real
   imc:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...


   //Não funciona
   
   
   
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