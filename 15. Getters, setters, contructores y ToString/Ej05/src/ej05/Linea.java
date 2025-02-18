package ej05;

import java.util.Scanner;

/*
 * Declarar una clase de nombre Linea que contenga:
Un atributo para guardar el numero
Un metodo que permita imprimir una secuencia que consta de un n�mero y tantos signos =
como indique el atributo seguido por un signo +, cada uno en una l�nea. Por ejemplo: 4====+.
Usar esta clase para crear tantas l�neas como desee el usuario. Los n�meros de la l�nea estar�n
comprendidos entre 1 y 10.
 */
public class Linea {
	Scanner in=new Scanner(System.in);
	
	private int numero;
	
	public Linea() {
	}
	
	public Linea(int numero) {
		this.numero=numero;
	}
	public String crearLineas() {
		int cantidad;
		do {
			System.out.print("Cuantas lineas vas a meter: ");
			cantidad=in.nextInt();
			if(cantidad<1||cantidad>10) {
				System.out.println("ERROR, las lineas deben estar comprendidas entre 1 y 10");
			}
		}while(cantidad<1|| cantidad>10);
		//crear los ==
		String lineas="";
		for(int i=0;i<cantidad;i++) {
			lineas+="=";
		}
		return numero+lineas+"+";
	}
}
