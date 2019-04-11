package LN;

import java.util.ArrayList;

import Comun.itfProperty;
import Excepciones.clsMatriculaVehiculoRepetida;

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
		listaParking = new ArrayList<clsParking>();
		listaZonas = new ArrayList<clsZona>();
		listaPlaza = new ArrayList<clsPlaza>();
		
		
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
	
	public void InsertarZona (String letraZona, int plazasCocheZona, int plazasMotoZona, int plazasMinusvalidoZona) {
		
		clsZona objZona;
		objZona = new clsZona(letraZona, plazasCocheZona, plazasMotoZona, plazasMinusvalidoZona);
		listaZonas.add(objZona);
	}
	
	public ArrayList<itfProperty> VisualizarZonas(){
		
		ArrayList<itfProperty>retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsZona a:listaZonas) {
			retorno.add(a);
		}
		return retorno;
	}
	
	public void InsertarPlaza (int numeroPlaza, boolean plazaOcupada, String zonadelaPlaza) {
		
		clsPlaza objPlaza;
		objPlaza = new clsPlaza(numeroPlaza, plazaOcupada, zonadelaPlaza);
		listaPlaza.add(objPlaza);
	}
	
	public ArrayList<itfProperty> VisualizarPlazas(){
		
		ArrayList<itfProperty>retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsPlaza a:listaPlaza) {
			retorno.add(a);
		}
		return retorno;
	}
	
	public void AltaVehiculo (String matricula, boolean minusvalido, int plazaVehiculo, String letrazona) throws clsMatriculaVehiculoRepetida
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(matricula, minusvalido, plazaVehiculo, letrazona);
		
		comprobarMatricula(objVehiculo);
		
		if(!Existe(objVehiculo)) {
			listaVehiculos.add(objVehiculo);
		} else {
			System.out.println("Ya existe un vehiculo con esa matricula");
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
	
	public static void comprobarMatricula(clsVehiculo nuevoVehiculo) throws clsMatriculaVehiculoRepetida {
		
		
		for (clsVehiculo objVehiculo : listaVehiculos) {
			
			if(objVehiculo.getMatricula() == nuevoVehiculo.getMatricula()) {
				
				throw new clsMatriculaVehiculoRepetida();
				
			}
		}
	}
	
}
