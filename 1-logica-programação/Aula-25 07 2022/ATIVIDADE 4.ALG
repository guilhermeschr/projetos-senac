Algoritmo "atividade 4"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/07/2022
Var
   // Seção de Declarações das variáveis
   a,b,c:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Coloque valores para A e B:")
   leia(a,b)

   se (a = b) entao
    c:= (a+b)
   senao
    c:= (a*b)
   fimse

   escreval("Valor " ,c)

Fimalgoritmo