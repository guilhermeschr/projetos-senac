Algoritmo "atividade 8 "
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/07/2022
Var
   // Se��o de Declara��es das vari�veis
   // a,b,c = valores lidos
   a,b,c:inteiro
   // d= menor
   // f= meio
   // g= maior
   d,f,g:inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Coloque valores para A, B, C:")
   escreval("Valor A:")
   leia(a)
   escreval("Valor B:")
   leia(b)
   escreval("Valor C:")
   leia(c)
   escreval("")

   //maior
   se (a>b)e(a>c)entao
      D:= a
   fimse
   se (b>a)e(a>c)entao
      D:= b
   fimse
   se (c>a)e(c>b)entao
      d:=c
   fimse
   // menor
   se (a<b)e(a<c)entao
      g:=a
   fimse
   se (b<a)e(b<c)entao
      g:=b
   fimse
   se (c<a)e(c<b)entao
      g:=c
   fimse
   //meio
   se(a<b)e(a>c)entao
      f:=a
   fimse
   se(a>b)e(a<c)entao
      f:=a
   fimse
   se(b<a)e(b>c)entao
      f:=b
   fimse
   se(b>a)e(b<c)entao
      f:=a
   fimse
   se(c>a)e(c<b)entao
      f:=a
   fimse
   se(c<a)e(c>b)entao
      f:=a
   fimse

   escreval("")
   escreval("Ordem decrescente:")
   escreval("")
   escreval("Maior: ",d)
   escreval("Meio:  ",f)
   escreval("menor: ",g)

Fimalgoritmo