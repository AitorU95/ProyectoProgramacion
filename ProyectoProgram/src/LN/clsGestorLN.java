package LN;

import java.util.ArrayList;

import Comun.itfProperty;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	/**
	 * Creamos un array que guardara los vehiculos
	 */
	
	public static ArrayList<clsParking> listaParking;
	public static ArrayList<clsVehiculo> listaVehiculos;
	public static ArrayList<clsZona> listaZonas;
	public static ArrayList<clsPlaza>listaPlaza;
	
	public clsGestorLN()
	{
		listaVehiculos = new ArrayList<clsVehiculo>();
		
	}
	
	/**
	 * metodo para dar de alta vehiculos
	 */

	
	public void InsertarDatosParking (String nombre, int plazascoches, int plazasmotos, int plazasminusvalidos, int zonastotales) {
		
		clsParking objParking;
		objParking = new clsParking(nombre, plazascoches, plazasmotos, plazasminusvalidos, zonastotales);
		listaParking.add(objParking);
	}
	
	
	public ArrayList<itfProperty> MostrarParkings(){
		
		ArrayList<itfProperty> retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsParking a:listaParking) {
			retorno.add(a);
		}
		return retorno;
	}
	
	
	
	public void AltaVehiculo (String matricula, boolean minusvalido, int plazaVehiculo, String letrazona) throws clsMatriculaVehiculoRepetida, clsPlazaOcupada
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(matricula, minusvalido, plazaVehiculo, letrazona);
		
		comprobarMatricula(objVehiculo);
		comprobarPlaza(objVehiculo);
		
		if(!Existe(objVehiculo)) {
			listaVehiculos.add(objVehiculo);
		} else {
			System.out.println("Ya existe ese veh�culo");
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
	 * metodo para comprobar si ya existe un veh�culo
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
	
	public static void comprobarMatricula(clsVehiculo nuevoVehiculo) throws clsMatriculaVehiculoRepetida {
		
		
		for (clsVehiculo objVehiculo : listaVehiculos) {
			
			if(objVehiculo.getMatricula() == nuevoVehiculo.getMatricula()) {
				
				throw new clsMatriculaVehiculoRepetida();
				
			}
		}
	}
	
	public static void comprobarPlaza(clsVehiculo nuevoVehiculo) throws clsPlazaOcupada{
		
		for (clsVehiculo objVehiculo: listaVehiculos) {
			
			if(objVehiculo.getPlazaVehiculo() == nuevoVehiculo.getPlazaVehiculo() && objVehiculo.getZonaVehiculo() == nuevoVehiculo.getZonaVehiculo()) {
				
				throw new clsPlazaOcupada();
			}
		}
	}
	
}
