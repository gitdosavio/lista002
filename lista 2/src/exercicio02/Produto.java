package exercicio02;

public class Produto {
String marca = "motorola";
String so = "Android";
float versaoSO = (float) 9.0;
String modelo = "moto g6 Plus";
int memoriaRam = 4;
int memoriaInterna = 64;

void falarMarca() {
	System.out.println("Marca " +marca);
}
void falarSistema() {
System.out.println("Sistema operacional " +so);
}
void falarVersao() {
System.out.println("Versão do sistema: " +versaoSO);
}
void falarModelo() {
System.out.println("Modelo " +modelo);
}
void falarRam() {
System.out.println("Memoria ram " +memoriaRam+ "gb");
}
void falarMemoria() {
System.out.println("Memoria interna " +memoriaInterna+ "gb");
}
}
