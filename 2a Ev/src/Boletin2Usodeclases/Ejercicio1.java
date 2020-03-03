package Boletin2Usodeclases;

import java.time.LocalDate;
import java.util.Date;

import Boletin2Usodeclases.Persona;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona p1= new Persona();
		{
		p1.nombre="Jose";
		p1.apellidos="Rodr�guez Mata";
		p1.fechaNacimiento= LocalDate.of(1965, 1, 15);
		p1.estatura= 1.65;
		}
		Persona p2= new Persona();
		{
		p2.nombre="Mar�a";
		p2.apellidos="S�nchez G�mez";
		p2.fechaNacimiento= LocalDate.of(1980, 12, 26);
		p2.estatura= 1.70;
		}
		Persona p3= new Persona();
		{
		p3.nombre="Alejandro";
		p3.apellidos="G�mez G�mez";
		p3.fechaNacimiento= LocalDate.of(2001, 11, 1);
		p3.estatura= 1.90;
		}
		Persona p4= new Persona();
		{
		p4.nombre="Jose Manuel";
		p4.apellidos="P�rez Pons";
		p4.fechaNacimiento= LocalDate.of(2010, 5, 1);
		p4.estatura= 1.27;
		}
		Persona p5= new Persona();
		{
		p5.nombre="Lorena";
		p5.apellidos="Remeseiro Neira";
		p5.fechaNacimiento= LocalDate.of(2000, 6, 12);
		p5.estatura= 1.60;
		}
		Persona p6= new Persona();
		{
		p6.nombre="Patricia";
		p6.apellidos="Seoane �lvarez";
		p6.fechaNacimiento= LocalDate.of(1976, 8, 23);
		p6.estatura= 1.60;
		}
		p1.mostrarDatos();
		p2.mostrarDatos();
		p3.mostrarDatos();
		p4.mostrarDatos();
		p5.mostrarDatos();
		p6.mostrarDatos();
		
		System.out.println("La edad de Jose Rodriguez Mata es: "+p1.obtenerEdad()+" a�os");
		System.out.println("La edad de Mar�a S�nchez G�mez es: "+p2.obtenerEdad()+" a�os");
		System.out.println("La edad de Alejandro G�mez G�mez es: "+p3.obtenerEdad()+" a�os");
		System.out.println("La edad de Jose Manuel P�rez Pons es: "+p4.obtenerEdad()+" a�os");
		System.out.println("La edad de Lorena Remeseiro Neira es: "+p5.obtenerEdad()+" a�os");
		System.out.println("La edad de Patricia Seoane �lvarez es: "+p6.obtenerEdad()+" a�os");
		
		
		Persona [] arrayPersona= {p1, p2, p3, p4, p5, p6};
		int personaMayor=Persona.personaMayor(arrayPersona);
		System.out.println("");
		System.out.println("La persona de mayor edad tiene: "+ personaMayor+" a�os y, es: "+p1.nombre+" "+p1.apellidos);
	}
}
