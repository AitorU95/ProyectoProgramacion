package Comun;
import java.util.Comparator;

import LN.clsVehiculo;

/**
 * clase que se utiliza para realizar la comparacion de plazas entre dos vehiculos
 * @author Industria 4.0
 *
 */

public class clsComparadorPlaza implements Comparator<clsVehiculo> 
{

	/**
	 * metodo que nos permite comparar las plazas de los vehículos
	 */
	
	@Override
	public int compare(clsVehiculo o1, clsVehiculo o2) 
	{
		if(o1.getZonaVehiculo().equalsIgnoreCase(o2.getZonaVehiculo())) {
			return o1.getPlazaVehiculo().compareTo(o2.getPlazaVehiculo());
		}else {
			return 0;
		}
		
	}

}
