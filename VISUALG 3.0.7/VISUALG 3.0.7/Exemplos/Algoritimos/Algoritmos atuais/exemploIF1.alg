algoritmo "semnome"
// Fun��o :Faca um algoritmo que leia os valores A,B,C
//e diga se a soma de A + B � menor que C
// Autor :
// Data : 09/10/2019
// Se��o de Declara��es 
var
     vA:INTEIRO
     vB:INTEIRO
     vC:INTEIRO
inicio
// Se��o de Comandos 

ESCREVAL("ESCREVA O NUMERO A")
LEIA(vA)
ESCREVAL("ESCREVA O NUMERO B")
LEIA(vB)
ESCREVAL("ESCREVA O NUMERO C")
LEIA(vC)

SE  (vA + vB = vC) ENTAO
ESCREVAL("O VALOR DE vA+Vb � igual a vC")
SENAO
     SE  (vA + vB < vC) ENTAO
         ESCREVAL("O VALOR DE vA+vB � MENOR QUE vC")
     SENAO
          ESCREVAL("O VALOR DE vA+vB � MAIOR QUE vC")
     FIMSE
FIMSE

fimalgoritmo





