package Boletin2Usodeclases;

import java.time.LocalDate;
import java.util.Date;
import java.time.temporal.ChronoUnit;
public class Persona {

	String nombre;
	String apellidos;
	LocalDate fechaNacimiento;
	double estatura;
	
	//public Persona(String nombre, String apellidos) {}
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("Estatura: "+ estatura);
		System.out.println("\n");
	}
	
	public int obtenerEdad() {
		
		//Date fechaNacimiento = new Date(65, 0,15);
		//System.out.println(fechaNacimiento);
		int edad= (int)ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
		return edad;
	}
	
	public static int personaMayor(Persona[] arrayPersona) {
		
		int personaMayor=0;
		Persona p =new Persona();
		
		for (int i=0;i<arrayPersona.length;i++)
		{
			
			if (p.obtenerEdad()>personaMayor) {
				
				personaMayor= (int) p.obtenerEdad();
			}
			
		}
		return personaMayor;
	}
}
