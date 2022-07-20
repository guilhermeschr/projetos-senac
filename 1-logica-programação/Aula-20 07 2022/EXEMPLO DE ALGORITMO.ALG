Algoritmo "Exemplo de algoritmo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/07/2022
Var
// Seção de Declarações das variáveis 
   nome:caracter;
   
   data:inteiro
   
   ativo: logico

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

data:= 5;
ativo:=verdadeiro

//regra de negocios: sistema tem uma regra de negocios, que
//desativa cliente com data de atualizacao de
//cadastro maior que 3 meses

//booleano - cadastro do cliente inicia ativo
escreval("Data atualizaçãdo cadastro", data, " meses")
//rotina 1
//cliente com cadastro atualizado a mais de 3 meses
se data > 3 entao
   ativo:= falso
   escreval("Meu cadastro esta com situaçao inativo!")
senao
     ativo:=verdadeiro
     escreval("Meu cadastro esta com situação ativo")
fimse
    
//rotina 2
//calcular limite de credito dos clientes ativos
se ativo=verdadeiro então
   escreval("calculando limitede credito..")
senão
     escreval("Cliente com cadastro inativo!Consulte a loja!")
     escreval("Data de atualizacao cadastro maior que 3 meses.")
     escreval("Ultima atualizacao há", data, " meses")
fimse




Fimalgoritmo