package Boletin3Usoavanzadoclases1;

	public class Remolque {
		public String matricula;
		public int longitud;
		
		public Remolque(String matricula, int longitud) {
			this.matricula=matricula;
			this.longitud=longitud;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "La matricula del remolque es: " + matricula + " y la longitud: "+longitud;
					
		}
}
