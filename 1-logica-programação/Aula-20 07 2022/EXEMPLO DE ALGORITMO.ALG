Algoritmo "Exemplo de algoritmo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/07/2022
Var
// Se��o de Declara��es das vari�veis 
   nome:caracter;
   
   data:inteiro
   
   ativo: logico

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

data:= 5;
ativo:=verdadeiro

//regra de negocios: sistema tem uma regra de negocios, que
//desativa cliente com data de atualizacao de
//cadastro maior que 3 meses

//booleano - cadastro do cliente inicia ativo
escreval("Data atualiza��do cadastro", data, " meses")
//rotina 1
//cliente com cadastro atualizado a mais de 3 meses
se data > 3 entao
   ativo:= falso
   escreval("Meu cadastro esta com situa�ao inativo!")
senao
     ativo:=verdadeiro
     escreval("Meu cadastro esta com situa��o ativo")
fimse
    
//rotina 2
//calcular limite de credito dos clientes ativos
se ativo=verdadeiro ent�o
   escreval("calculando limitede credito..")
sen�o
     escreval("Cliente com cadastro inativo!Consulte a loja!")
     escreval("Data de atualizacao cadastro maior que 3 meses.")
     escreval("Ultima atualizacao h�", data, " meses")
fimse




Fimalgoritmo