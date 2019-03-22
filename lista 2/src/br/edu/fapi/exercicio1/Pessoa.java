package br.edu.fapi.exercicio1;

public class Pessoa {

String nome="Savio";
String sobrenome="Dias";
double rg=13239;
int idade=19;

void falarNome() {
	System.out.println("Meu nome é " +nome);
}
void falarSobrenome() {
	System.out.println("Meu sobrenome é " +sobrenome);
}
double falarRg() {
	System.out.println("Meu rg é " +rg);
	return rg;
}
int falarIdade() {
	System.out.println("Minha idade é " +idade);
	return idade;
}
	
}
