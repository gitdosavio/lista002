package br.edu.fapi.exercicio1;

public class Pessoa {

String nome="Savio";
String sobrenome="Dias";
double rg=13239;
int idade=19;

void falarNome() {
	System.out.println("Meu nome � " +nome);
}
void falarSobrenome() {
	System.out.println("Meu sobrenome � " +sobrenome);
}
double falarRg() {
	System.out.println("Meu rg � " +rg);
	return rg;
}
int falarIdade() {
	System.out.println("Minha idade � " +idade);
	return idade;
}
	
}
