package ej02;

/*
 * Crea una clase Contador que contenga:
Un �nico atributo llamado contador de tipo entero
Los m�todos para incrementar() y decrementar() el contador.
Un constructor por defecto, un constructor con par�metro
Los m�todos getters, setters y toString().
Desde el main(), hacer uso de la clase. Crear un objeto contador y usar los m�todos dise�ados
 */
public class Contador {
	int contador;

	public Contador() {
		this.contador=5;
	}

	public Contador(int contador) {
		this.contador = contador;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void incrementar() {
		contador+=1;
	}
	public void decrementar() {
		contador-=1;
	}
}
