package Boletin3Usoavanzadoclases1;

import Boletin3Usoavanzadoclases1.Vehiculo;

public class Coche extends Vehiculo{
	
	
	private int numeroPlazas;

	public Coche(int numeroPlazas, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		this.numeroPlazas=numeroPlazas;
		this.matricula=matricula;
		this.tipo=tipo;
		this.velocidadMaxima=velocidadMaxima;
		this.conductor=conductor;
		
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.printf("\n Los datos de este coche son: \n Número de plazas: %d\n \n",numeroPlazas);
	
	}
	
	
	
}
