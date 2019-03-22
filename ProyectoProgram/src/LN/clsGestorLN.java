package LN;

import java.util.ArrayList;

import Comun.itfProperty;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	ArrayList<clsVehiculo> listaVehiculos;
	
	public clsGestorLN()
	{
		listaVehiculos = new ArrayList<clsVehiculo>();
		
	}
	
	
	public void AltaVehiculo (String tipovehiculo, boolean minusvalido, String matricula, String letrazona)
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(tipovehiculo, minusvalido, matricula, letrazona);
		listaVehiculos.add(objVehiculo);
		
		
	}
	
	public ArrayList<itfProperty> MostrarVehiculos(){
		
		ArrayList<itfProperty> retorno;
		
		retorno = new ArrayList <itfProperty>();
		
		for(clsPlaza a:listaVehiculos) {
			retorno.add(a);
		}
		
		return retorno;
	}
	

	
}
