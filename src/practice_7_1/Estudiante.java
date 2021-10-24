package practice_7_1;

/*
 * 4. Escriba una clase Estudiante. Debe tener las siguientes variables de instancias para el nombre,
 *    los cr�ditos, el promedio ponderado (GPA) y los puntos de calidad. Cree un m�todo constructor.
 *    Cree los otros dos m�todos de la siguiente manera:
 *    		a. Un m�todo que devolver� el promedio ponderado actual, que ser�n los puntos de calidad
 *    		   divididos por los cr�ditos.
 *    		b. Un m�todo que tomar� los cr�ditos de la clase o el semestre junto con los puntos de
 *    		   calidad. Debe actualizar los cr�ditos, los puntos de calidad y el GPA.
 */

public class Estudiante {
	
	private String nombre;
	private int creditos;
	private double gpa;
	private int puntosDeCalidad;
	
	//-------------------------------------------
	
	public Estudiante(String nombre, int creditos, int puntosDecalidad) {
		this.nombre = nombre;
		this.creditos = 0;
		this.puntosDeCalidad = 0;
		this.gpa = 0;
		
		AddCreditosPuntosCalidad(0, 0);
	}
	
	//-------------------------------------------
	
	public void AddCreditosPuntosCalidad(int creditos, int puntosDeCalidad) {
		this.creditos += creditos;
		this.puntosDeCalidad += puntosDeCalidad;
		gpa = this.creditos != 0 ? this.puntosDeCalidad / this.creditos : 0;
	}
	
	//-------------------------------------------
	
	public double GetGPA() {
		return gpa;
	}
	
	//-------------------------------------------
}
