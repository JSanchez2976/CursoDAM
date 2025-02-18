package ej04;

/*
 * Crea una clase Fecha que contenga:
Los atributos: dia, mes y a�o.
Constructores: Un constructor por defecto y un constructor con par�metros.
M�todos: setters y getters y el m�todo toString(), un m�todo para comprobar si la fecha
es correcta y otro para modificar la fecha actual por la del d�a siguiente.
Desde la clase principal hacer uso de la clase. Leer una fecha de teclado y comprobar si es correcta o
no
 */
public class Fecha {
	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {
	}

	public Fecha(int fecha, int mes, int a�o) {
		this.dia = fecha;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getFecha() {
		return dia;
	}

	public void setFecha(int fecha) {
		this.dia = fecha;
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
		return "Fecha [fecha=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}

	public String comprobarFecha() {
		if(dia<1 || dia>31 || mes<1 || mes>12 || a�o>2025) {
			return "incorrecta";
		} else {
			return "correcta";
		}
	}
	
	public void modificarFecha() {
		dia+=1;
		if(dia==32) {
			dia=1;
			mes+=1;
			if(mes==13) {
				mes=1;
				a�o+=1;
			}
		}
		
	}
}
