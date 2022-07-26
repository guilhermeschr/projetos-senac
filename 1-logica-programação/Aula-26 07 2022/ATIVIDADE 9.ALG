Algoritmo "atividade 9"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
// Seção de Declarações das variáveis 
   a,b,c,d,f,g:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreval("Coloque valores para A, B, C:")
   escreval("Valor A:")
   leia(a)
   escreval("Valor B:")
   leia(b)
   escreval("Valor C:")
   leia(c)
   escreval("")

   se (a>b)e(a>b)entao
      D:= a
   fimse
   se (b>a)e(a>c)entao
      D:= b
   fimse
   se (c>a)e(c>b)entao
      d:=c
   fimse
   //
   se (a<b)e(a<c)entao
      g:=a
   fimse
   se (b<a)e(b<c)entao
      g:=b
   fimse
   se (c<a)e(c<b)entao
      g:=c
   fimse
   //
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
   escreval("Ordem crecente:")
   escreval("")
      escreval(d)
      escreval(f)
      escreval(g)

Fimalgoritmo