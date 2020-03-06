package Boletin3Usoavanzadoclases1;

import Boletin3Usoavanzadoclases1.Conductor;
import Boletin3Usoavanzadoclases1.Remolque;

public class Camion extends Vehiculo{
		private int altura;
		private Remolque remolque;
		public String matricula;
		public String tipo;
		public int velocidadMaxima;
		public Conductor conductor;
		
		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

		public Remolque getRemolque() {
			return remolque;
		}

		public void setRemolque(Remolque remolque) {
			this.remolque = remolque;
		}

		public Camion(Remolque remolque, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
			this.remolque=remolque;
			this.matricula=matricula;
			this.tipo=tipo;
			this.velocidadMaxima=velocidadMaxima;
			this.conductor=conductor;
		}
		
		public Camion(String matricula, String tipo, int velocidadMaxima, int altura) {
				
			super(matricula,tipo,velocidadMaxima);
			this.altura = altura;
			
		}
		
		public void mostrarDatos() {
			System.out.printf("Los datos de este camión son: \n Altura: %d\n Remolque: \n %s\n ",altura,remolque);
		}
}