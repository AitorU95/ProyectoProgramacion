package LN;

import java.util.ArrayList;
import java.util.Collections;

import Comun.itfProperty;
import Excepciones.clsMatriculaIncorrecta;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	/**
	 * Creamos los arrays que guardaran los distintos objetos dependiendo de cada clase
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
	 * metodo que usa el gestor para crear objetos de tipo parking y añairlos a su correspondiente array
	 */
	public void InsertarDatosParking (String nombre, int plazascoches, int plazasmotos, int plazasminusvalidos, int zonastotales) {
		
		clsParking objParking;
		objParking = new clsParking(nombre, plazascoches, plazasmotos, plazasminusvalidos, zonastotales);
		listaParking.add(objParking);
	}
	
	/**
	 * metodo que crea un array de los parkings existentes para poder mostrarlos
	 * @return
	 */
	public ArrayList<itfProperty> MostrarParkings(){
		
		ArrayList<itfProperty> retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsParking a:listaParking) {
			retorno.add(a);
		}
		return retorno;
	}
	
	/**
	 * metodo que usa el gestor para crear objetos de tipo zona y añairlos a su correspondiente array
	 * @param letraZona
	 * @param plazasCocheZona
	 * @param plazasMotoZona
	 * @param plazasMinusvalidoZona
	 */
	public void InsertarZona (String letraZona, int plazasCocheZona, int plazasMotoZona, int plazasMinusvalidoZona) {
		
		clsZona objZona;
		objZona = new clsZona(letraZona, plazasCocheZona, plazasMotoZona, plazasMinusvalidoZona);
		listaZonas.add(objZona);
	}
	
	/**
	 *  metodo que crea un array de las zonas existentes para poder mostrarlas
	 * @return
	 */
	public ArrayList<itfProperty> VisualizarZonas(){
		
		ArrayList<itfProperty>retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsZona a:listaZonas) {
			retorno.add(a);
		}
		return retorno;
	}
	
	/**
	 *  metodo que usa el gestor para crear objetos de tipo plaza y añairlos a su correspondiente array
	 * @param numeroPlaza
	 * @param plazaOcupada
	 * @param zonadelaPlaza
	 */
	public void InsertarPlaza (int numeroPlaza, boolean plazaOcupada, String zonadelaPlaza) {
		
		clsPlaza objPlaza;
		objPlaza = new clsPlaza(numeroPlaza, plazaOcupada, zonadelaPlaza);
		listaPlaza.add(objPlaza);
	}
	
	/**
	 *  metodo que crea un array de las plazas existentes para poder mostrarlas
	 * @return
	 */
	public ArrayList<itfProperty> VisualizarPlazas(){
		
		ArrayList<itfProperty>retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsPlaza a:listaPlaza) {
			retorno.add(a);
		}
		return retorno;
	}
	
	/**
	 *  metodo que usa el gestor para crear objetos de tipo vehiculo y añadirlos a su correspondiente array
	 * @param matricula
	 * @param minusvalido
	 * @param plazaVehiculo
	 * @param letrazona
	 * @throws clsMatriculaVehiculoRepetida
	 * @throws clsPlazaOcupada
	 * @throws clsMatriculaIncorrecta
	 */
	public void AltaVehiculo (String matricula, boolean minusvalido, int plazaVehiculo, String letrazona) throws clsMatriculaVehiculoRepetida, clsPlazaOcupada, clsMatriculaIncorrecta
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(matricula, minusvalido, plazaVehiculo, letrazona);
		
		comprobarMatricula(objVehiculo);
		matriculaIncorrecta(objVehiculo);
		comprobarPlaza(objVehiculo);
		ordenarVehiculos();
		
		if(!Existe(objVehiculo)) {
			listaVehiculos.add(objVehiculo);
		} else {
			System.out.println("Ya existe este vehículo");
		}
	}
	
	/**
	 * metodo que crea un array de los vehiculos existentes para poder mostrarlos
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
	
	/**
	 * metodo que comprueba si hemos introducido un matricula repetida
	 * @param nuevoVehiculo
	 * @throws clsMatriculaVehiculoRepetida
	 */
	public static void comprobarMatricula(clsVehiculo nuevoVehiculo) throws clsMatriculaVehiculoRepetida {
		
		
		for (clsVehiculo objVehiculo : listaVehiculos) {
			
			if(objVehiculo.getMatricula().equalsIgnoreCase(nuevoVehiculo.getMatricula()) ) {
				
				throw new clsMatriculaVehiculoRepetida();
				
			}
		}
	}
	
	/**
	 * metodo que comprueba si hemos introducido un plaza que esta ya ocupada
	 * @param nuevoVehiculo
	 * @throws clsPlazaOcupada
	 */
	public static void comprobarPlaza(clsVehiculo nuevoVehiculo) throws clsPlazaOcupada {
		
		for (clsVehiculo objVehiculo: listaVehiculos) {
			
			if(objVehiculo.getPlazaVehiculo().equals(nuevoVehiculo.getPlazaVehiculo())  && objVehiculo.getZonaVehiculo().equalsIgnoreCase(nuevoVehiculo.getZonaVehiculo())) {
				
				throw new clsPlazaOcupada();
			}
		}
	}
	
	/**
	 * metodo que comprueba si la matricula que hemos metido tiene 7 digitos
	 * @param nuevoVehiculo
	 * @throws clsMatriculaIncorrecta
	 */
	public static void matriculaIncorrecta(clsVehiculo nuevoVehiculo) throws clsMatriculaIncorrecta {
		
		for(clsVehiculo objvehiculo: listaVehiculos) {
			
			if(objvehiculo.getMatricula().length() != 7  ) {
				
				throw new clsMatriculaIncorrecta();
			}
		}
	}
	
	/**
	 * metodo que ordena los vehículos dentro de nuestra lista de vehículos
	 * @throws clsComparadorZona
	 * @throws clsComparadorPlaza
	 */
	
	public static void ordenarVehiculos() {
		
		Collections.sort(listaVehiculos, new clsComparadorZona());
		Collections.sort(listaVehiculos, new clsComparadorPlaza());
		
	}
	
}
