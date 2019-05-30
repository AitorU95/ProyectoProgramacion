package Comun;

import java.util.Comparator;

import LN.clsVehiculo;

/**
 * clase que permite ordenar por matricula los vehiculos
 * @author Industria 4.0
 *
 */

public class OrdenarMatricula implements Comparator <clsVehiculo> {
	
		public int compare(clsVehiculo vehiculo1, clsVehiculo vehiculo2) {
		
		String matricula1 = vehiculo1.getMatricula();
		String matricula2 = vehiculo2.getMatricula();
		
		return matricula1.compareTo(matricula2);
	}

}
