package ej02;

import java.util.Scanner;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean repetidor;
	private int curso;

	public Alumno(String nombre, String apellidos, int edad, boolean repetidor, int curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.repetidor = repetidor;
		this.curso = curso;
	}

	public Alumno() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", repetidor=" + repetidor
				+ ", curso=" + curso + "]";
	}

	public void rellenar() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre = ");
		nombre = in.nextLine();
		System.out.print("Apellidos = ");
		apellidos = in.nextLine();
		System.out.println("Edad = ");
		edad = in.nextInt();
		in.nextLine();
		String respuesta;
		// repetidor
		do {
			System.out.print("Es repetidor? (si/no) = ");
			respuesta = in.nextLine();
			if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
				System.out.println("ERROR, la respuesta debe ser si o no");
			}
		} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
		if (respuesta.equalsIgnoreCase("si")) {
			repetidor = true;
		} else {
			repetidor = false;
		}
		// curso
		do {
			System.out.println("Curso = ");
			curso = in.nextInt();
			if (curso != 1 && curso != 2) {
				System.out.println("ERROR, el curso debe ser '1' o '2'");
			}
		} while (curso != 1 && curso != 2);
	}

	public void visualizar() {
		System.out.println("Nombre = " + nombre);
		System.out.println("Apellidos = " + apellidos);
		System.out.println("Edad = " + edad);
		System.out.println("Repetidor = " + repetidor);
		System.out.println("Curso = " + curso);
	}

	public static void consultarAlumnoPorApellido(Alumno[] alumnos) {
		Scanner in=new Scanner(System.in);
		ordenarPorApellido(alumnos);
		int li=0;
		int ls=alumnos.length-1;
		int m=(li+ls)/2;
		System.out.println("Que apellido quieres buscar: ");
		String apellido=in.nextLine();
		do {
			if(alumnos[m].getApellidos().compareTo(apellido)>0) {
				ls=m-1;
			}
			else if(alumnos[m].getApellidos().compareTo(apellido)<0) {
				li=m+1;
			}
			else {
				System.out.println("Encontrado en la posicion "+m);
				break;
			}
			m=(li+ls)/2;
		}while(li<=ls);
		
		if(li>ls) {
			System.out.println("Valor no encontrado");
		}
	}

	public static void ordenarPorApellido(Alumno[] alumnos) {
		// burbuja
		for (int i = 1; i < alumnos.length; i++) {
			for (int j = alumnos.length - 1; j >= i; j--) {
				if (alumnos[j].getApellidos().compareTo(alumnos[j - 1].getApellidos()) < 0) {
					Alumno aux = alumnos[j];
	                alumnos[j] = alumnos[j - 1];
	                alumnos[j - 1] = aux;
				}
			}
		}

	}
}
