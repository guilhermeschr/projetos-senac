Algoritmo "atividade 4"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/07/2022
Var
   // Se��o de Declara��es das vari�veis
   a,b,c:inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Coloque valores para A e B:")
   leia(a,b)

   se (a = b) entao
    c:= (a+b)
   senao
    c:= (a*b)
   fimse

   escreval("Valor " ,c)

Fimalgoritmo