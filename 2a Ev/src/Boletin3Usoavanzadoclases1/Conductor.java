package Boletin3Usoavanzadoclases1;

public class Conductor {
	
	String dni;
	String nombre;
	
	
	public Conductor(String dni, String nombre) {
	this.dni=dni;
	this.nombre=nombre;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El dni del conductor es: " + dni + " y el nombre es: "+nombre;		
	}
}