Algoritmo "Exemplo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/07/2022
Var
// Se��o de Declara��es das vari�veis 


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  HORARIO_LEVANTAR_MANHA_CEDO = 0;
DIA_SEMANA = SEGUNDA-FEIRA;
DIA_SEMANA = SABADO;
DIA_SEMANA = FERIADO;

SE (DIA_SEMANA = "SABADO")  OU  (DIA_SEMANA = "FERIADO") ENTAO
    HORARIO_LEVANTAR_MANHA_CEDO = 9;
FIMSE

SE NAO((DIA_SEMANA = "SABADO")  OU  (DIA_SEMANA = "FERIADO")) ENTAO
    HORARIO_LEVANTAR_MANHA_CEDO = 7;
FIMSE

SALDO_DEPOSITAR = 0;

// OCORRE OPERACAO
ANALIZA SALDO
CONSULTA SERVIDOR DO BANCO

// REPRESENTADO POR CODIGO OU CPF
SE SALDO_CLIENTE_CPFXXXX > 0 ENTAO
    SALDO_DEPOSITAR = SALDO_CLIENTE_CPFXXXX
FIMSE

SE SALDO_DEPOSITAR > 0 ENTAO
    REALIZA_TRANSFERENCIA DE SALDO
SENAO
    ESCREVA("SALDO INSUFICIENTE!")
FIMSE

Fimalgoritmo