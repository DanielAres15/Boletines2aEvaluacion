package Boletin3Usoavanzadoclases1;

public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		Conductor conductorCoche1=new Conductor("54856324F","Zaida");
		Coche coche1=new Coche(5,"2524ASD","Sedán",200,conductorCoche1);
		Remolque remolque1=new Remolque("5236ASD",1000);
		Conductor conductorCamion1=new Conductor("54336547Z","María");
		Camion camion1=new Camion(remolque1,"222FFF","Rígido",100,conductorCamion1);
		
		coche1.mostrarDatos();
	
		camion1.mostrarDatos();
		
		impresionPolimorfismo(coche1);
		
		impresionPolimorfismo(camion1);
		
		siCamionRemolque(coche1);
		
		siCamionRemolque(camion1);
	
		Camion camion2=new Camion("222FFF","Rígido",100, 5);
		
		camion2.mostrarDatos();
	}
	
	public static void impresionPolimorfismo (Vehiculo vehiculo) {
			vehiculo.mostrarDatos();
		}
	
	public static void siCamionRemolque (Vehiculo vehiculo) {
		
		if (vehiculo instanceof Camion) {
			Camion vehCamion=(Camion) vehiculo;
			System.out.println(vehCamion.getRemolque());
		}
	}
}
