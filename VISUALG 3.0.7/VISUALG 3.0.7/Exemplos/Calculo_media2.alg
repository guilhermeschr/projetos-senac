Algoritmo "Calculo_Media2"
// Disciplina: [Linguagem e L�gica de programa�ao] 
// Fun��o : calculo da m�dia aritim�tica verificando o resultado for maior ou igual a 7; 
// se Sim mostre o aluno xxxx passou
// se N�o mostre o aluno xxxx reprovou
// Autor : Professor Antonio
// Data : 05/04/2015
// Se��o de Declara��es

var
    Nota1, Nota2, Nota3, Nota4, Nota5, Media: Real
    Aluno : Caracter
Inicio
// Se��o de Comandos
Escreva ("Digite o nome do aluno: ")
    Leia (Aluno)

Escreva ("Digite a Primeira nota: ")
    Leia (Nota1)
 Escreva ("Digite a Segunda nota: ")
    Leia (Nota2)
 Escreva ("Digite a Terceira nota: ")
    Leia (Nota3)
Escreva ("Digite a Quarta nota: ")
    Leia (Nota4)
Media <- (Nota1+ Nota2 + Nota3+ Nota4+ Nota5) / 5
    Escreva ("A M�dia eh: ", Media)
Se Media >=7 entao
     Escreva(" O Aluno ",Aluno, " Passou")
Senao
     Escreva(" O Aluno ",Aluno, " Reprovou")
fimse
Fimalgoritmo

