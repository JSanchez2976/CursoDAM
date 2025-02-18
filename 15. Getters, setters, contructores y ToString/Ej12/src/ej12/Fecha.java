package ej12;

import java.util.Scanner;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {
	}

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}

	public void rellenarFecha() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Dia = ");
			dia = in.nextInt();
			if (dia < 1 || dia > 31) {
				System.out.println("Introduce un d�a correcto");
			}
		} while (dia < 1 || dia > 31);

		do {
			System.out.print("Mes = ");
			mes = in.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Introduce un mes correcto");
			}
		} while (mes < 1 || mes > 12);

		do {
			System.out.print("A�o = ");
			a�o = in.nextInt();
			if (a�o > 2025) {
				System.out.println("Introduce un a�o correcto");
			}
		} while (a�o > 2025);
	}

	public String visualizarFecha() {
		return "(" + dia + "/" + mes + "/" + a�o+")";
	}
}
