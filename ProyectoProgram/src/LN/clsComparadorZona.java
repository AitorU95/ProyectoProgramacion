package LN;
import java.util.Comparator;

public class clsComparadorZona implements Comparator<clsVehiculo> 
{

	/**
	 * metodo que nos permite comparar las zonas de los veh�culos
	 */
	
	@Override
	public int compare(clsVehiculo o1, clsVehiculo o2) 
	{
		
		return o1.getZonaVehiculo().compareTo(o2.getZonaVehiculo());
	}

}
