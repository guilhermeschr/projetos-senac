algoritmo "Algoritmo"
// Fun��o : achar o numero intermediario
// Autor :  Gelvazio
// Data : 11/10/2019
// Se��o de Declara��es 
var

vA: INTEIRO
vB: INTEIRO
vC: INTEIRO

inicio
// Se��o de Comandos 
ESCREVAL("ESCREVA O NUMERO DE A")
LEIA(vA)
ESCREVAL("ESCREVA O NUMERO DE B")
LEIA(vB)
ESCREVAL("ESCREVA O NUMERO DE C")
LEIA(vC)



SE (vA > vC) E (vA < vB)ENTAO
   ESCREVAL("O INTERMEDIARIO � vA:",vA)
FIMSE

SE (vB > vC) E (vB < vA)ENTAO
   ESCREVAL("O INTERMEDIARIO � vB:",vB)
FIMSE

SE (vC > vA) E (vC < vB) ENTAO
   ESCREVAL("O INTERMEDIARIO � vC:",vC)
FIMSE


fimalgoritmo
