package LN;

import java.util.ArrayList;
import java.util.HashSet;

import Comun.itfProperty;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	/**
	 * Creamos un array que guardara los vehiculos
	 */
	
	
	public static ArrayList<clsVehiculo> listaVehiculos;
	
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
		
		if(!Existe(objVehiculo)) {
			listaVehiculos.add(objVehiculo);
		} else {
			System.out.println("Ya existe ese vehículo");
		}
		
	
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
	
	
	/**
	 * metodo para comprobar si ya existe un vehículo
	 * @param _vehiculo
	 * @return
	 */
	public static boolean Existe(clsVehiculo _vehiculo)
	{
		
		boolean retorno = false;
		
		for(clsVehiculo b:listaVehiculos)
		{
			if(b.equals(_vehiculo)) return true;
			
		}
		
		return retorno;
		
	}
	
}
