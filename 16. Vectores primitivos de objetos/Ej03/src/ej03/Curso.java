package ej03;

import java.util.Scanner;

public class Curso {
	private String nombreCurso;
	private Persona profesor;
	
	public Curso() {
	}

	public Curso(String nombreCurso, Persona profesor) {
		this.nombreCurso = nombreCurso;
		this.profesor = profesor;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Persona getProfesor() {
		return profesor;
	}

	public void setProfesor(Persona profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", profesor=" + profesor + "]";
	}
	
	public void rellenar() {
		Scanner in=new Scanner(System.in);
		System.out.println("*** RELLENAR CURSO ***");
		System.out.print("Nombre del curso = ");
		nombreCurso=in.nextLine();
		this.profesor= new Persona();
		profesor.rellenar();
	}
	
	public void visualizar() {
		System.out.println("*** CURSO ***");
		System.out.println("Nombre del curso "+nombreCurso);
		profesor.visualizar();
	}
}
