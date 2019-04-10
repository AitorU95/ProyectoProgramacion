package LN;

import java.util.ArrayList;

import Comun.itfProperty;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	/**
	 * Creamos un array que guardara los vehiculos
	 */
	
	
	ArrayList<clsVehiculo> listaVehiculos;
	
	public clsGestorLN()
	{
		listaVehiculos = new ArrayList<clsVehiculo>();
		
	}
	
	/**
	 * metodo para dar de alta vehiculos
	 * @param tipovehiculo
	 * @param minusvalido
	 * @param matricula
	 * @param letrazona
	 */
	public void AltaVehiculo (String matricula, boolean minusvalido, String plazaVehiculo)
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(matricula, minusvalido, plazaVehiculo);
		listaVehiculos.add(objVehiculo);
		
	
	}
	
	/**
	 * metodo que nos muestra los vehiculos que hemos insertado
	 * @return
	 */
	
	public ArrayList<itfProperty> MostrarVehiculos()
	{
		
		ArrayList<itfProperty> retorno;
		
		retorno = new ArrayList <itfProperty>();
		
		for(clsVehiculo a:listaVehiculos)
		{
			retorno.add(a);
		}
		
		return retorno;
	}
	

	
}
