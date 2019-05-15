package LN;
import java.util.Comparator;

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
