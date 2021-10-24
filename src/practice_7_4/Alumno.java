package practice_7_4;

import java.sql.Date;

public class Alumno extends Person {
	//-------------------------------------------
	
	private double gpa;
	private int id;
	private String carrera;
	private String tituloObtenido;
	private int anyoGraduacionEsperado;
	 
	//-------------------------------------------
	
	public Alumno(String firstName, String middleName, String lastName, Date dateOfBirth) {
		super(firstName, middleName, lastName, dateOfBirth);
	}
	
	//-------------------------------------------
	
	public double getGpa() {
		return gpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public String getTituloObtenido() {
		return tituloObtenido;
	}
	
	public int getAnyoGraduacionEsperado() {
		return anyoGraduacionEsperado;
	}
	
	//-------------------------------------------
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void setTituloObtenido(String tituloObtenido) {
		this.tituloObtenido = tituloObtenido;
	}
	
	public void setAnyoGraduacionEsperado(int anyoGraduacionEsperado) {
		this.anyoGraduacionEsperado = anyoGraduacionEsperado;
	}
	
	//-------------------------------------------
	
	public void calculateGpa(String ...calificaciones) {
		
		double sumCalificaciones = 0;
		for (String calificacion : calificaciones) {
			sumCalificaciones += traducirCalificacion(calificacion);
		}
		
		gpa = sumCalificaciones / calificaciones.length; 
	}
	
	private double traducirCalificacion(String calificacion) {
		switch(calificacion) {
		case "A":
			return 4;
		case "A-":
			return 3.67;
		case "B+":
			return 3.33;
		case "B":
			return 3;
		case "B-":
			return 2.67;
		case "C+":
			return 2.33;
		case "C":
			return 2;
		case "D":
			return 1;
		case "F":
			return 0;
		default:
			return 0;
		}
	}

		//-------------------------------------------
}
