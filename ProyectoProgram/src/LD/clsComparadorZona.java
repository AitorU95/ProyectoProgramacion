package LD;
import java.util.Comparator;

import LN.clsVehiculo;

public class clsComparadorZona implements Comparator<clsVehiculo> 
{

	/**
	 * metodo que nos permite comparar las zonas de los vehÝculos
	 */
	
	@Override
	public int compare(clsVehiculo o1, clsVehiculo o2) 
	{
		
		return o1.getZonaVehiculo().compareTo(o2.getZonaVehiculo());
		
	}

}
