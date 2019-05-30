package Comun;
import java.util.Comparator;

import LN.clsVehiculo;

/**
 * clase para comparar las zonas entre dos vehiculos
 * @author Industria 4.0
 *
 */

public class clsComparadorZona implements Comparator<clsVehiculo> 
{

	
	@Override
	public int compare(clsVehiculo o1, clsVehiculo o2) 
	{
		
		return o1.getZonaVehiculo().compareTo(o2.getZonaVehiculo());
	}

}
