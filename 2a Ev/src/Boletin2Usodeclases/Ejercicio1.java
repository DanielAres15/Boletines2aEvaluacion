package Boletin2Usodeclases;

import java.util.Date;

import Boletin2Usodeclases.Persona;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona p1= new Persona();
		{
		p1.nombre="Jose";
		p1.apellidos="Rodríguez Mata";
		p1.fechaNacimiento= new Date(65, 0, 15);
		p1.estatura= 1.65;
		}
		Persona p2= new Persona();
		{
		p2.nombre="María";
		p2.apellidos="Sánchez Gómez";
		p2.fechaNacimiento= new Date(80, 11, 26);
		p2.estatura= 1.70;
		}
		Persona p3= new Persona();
		{
		p3.nombre="Alejandro";
		p3.apellidos="Gómez Gómez";
		p3.fechaNacimiento= new Date(101, 10, 1);
		p3.estatura= 1.90;
		}
		Persona p4= new Persona();
		{
		p4.nombre="Jose Manuel";
		p4.apellidos="Pérez Pons";
		p4.fechaNacimiento= new Date(110, 4, 1);
		p4.estatura= 1.27;
		}
		p1.mostrarDatos();
		p2.mostrarDatos();
		p3.mostrarDatos();
		p4.mostrarDatos();
		
		p1.obtenerEdad();
		p2.obtenerEdad();
		p3.obtenerEdad();
		p4.obtenerEdad();
	}
}
