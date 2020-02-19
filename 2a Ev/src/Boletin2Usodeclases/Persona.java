package Boletin2Usodeclases;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

	String nombre;
	String apellidos;
	Date fechaNacimiento;
	double estatura;
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("Estatura: "+ estatura);
		System.out.println("\n");
	}
	
	public void obtenerEdad() {
		
		Date fechaNacimiento = new Date(65, 0,15);
		System.out.println(fechaNacimiento);
		
	}
}
