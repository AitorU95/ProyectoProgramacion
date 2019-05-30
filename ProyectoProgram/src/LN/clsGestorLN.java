package LN;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Comun.clsComparadorPlaza;
import Comun.clsComparadorZona;
import Comun.itfProperty;
import Excepciones.clsListaVacia;
import Excepciones.clsMatriculaIncorrecta;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;
import LD.clsDatos;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN {
	
	clsDatos objDatos = new clsDatos();
	
	/**
	 * Creamos los arrays que guardaran los distintos objetos dependiendo de cada clase
	 */
	
	public static ArrayList<clsParking> listaParking = new ArrayList<clsParking>();
	public static ArrayList<clsVehiculo> listaVehiculos = new ArrayList<clsVehiculo>();
	public static ArrayList<clsZona> listaZonas= new ArrayList<clsZona>();
	public static ArrayList<clsPlaza>listaPlaza= new ArrayList<clsPlaza>();
	
	
	
	
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
	 *  metodo que usa el gestor para crear objetos de tipo vehiculo y añadirlos a su correspondiente array y a la base de datos
	 * @param matricula
	 * @param minusvalido
	 * @param plazaVehiculo
	 * @param letrazona
	 * @throws clsMatriculaVehiculoRepetida
	 * @throws clsPlazaOcupada
	 * @throws clsMatriculaIncorrecta
	 * @throws SQLException 
	 */
	public void AltaVehiculo (String matricula, String minusvalido, int plazaVehiculo, String letrazona, String tipoVehiculo) throws clsMatriculaVehiculoRepetida, clsPlazaOcupada, clsMatriculaIncorrecta, SQLException
	{
		
		clsVehiculo objVehiculo;
		objVehiculo = new clsVehiculo(matricula, minusvalido, plazaVehiculo, letrazona, tipoVehiculo);
		
		comprobarMatricula(objVehiculo);
		matriculaIncorrecta(objVehiculo);
		comprobarPlaza(objVehiculo);
		ordenarVehiculos();
		
		if(!Existe(objVehiculo)) {
			
			listaVehiculos.add(objVehiculo);
			objDatos.InsertarVehiculo(matricula, minusvalido, plazaVehiculo, letrazona, tipoVehiculo);
			
		} else {
			
			System.out.println("Ya existe este vehículo");
		}
	}
	
	/**
	 * metodo para volcar los datos de la base de datos a nuestro programa
	 * @throws SQLException
	 */
	public void RecuperarDatosVehiculo() throws SQLException {

		Connection objConn = objDatos.conectarBD();
		ResultSet vehiculosRecuperadoSet = objDatos.ConsultarVehiculos();

		while (vehiculosRecuperadoSet.next()) {

			String matricula = vehiculosRecuperadoSet.getString("matricula");
			String minusvalido = vehiculosRecuperadoSet.getString("minusvalido");
			int plaza = vehiculosRecuperadoSet.getInt("plazaVehiculo");
			String zona = vehiculosRecuperadoSet.getString("ZonaVehiculo");
			String tipo = vehiculosRecuperadoSet.getString("tipoVehiculo");
			

			clsVehiculo objVehiculo = new clsVehiculo(matricula, minusvalido, plaza, zona, tipo);

			listaVehiculos.add(objVehiculo);

		}

		objConn.close();

	}
	
	/**
	 * metodo para mostrar la listaVehiculos
	 * @return
	 */
	public ArrayList<clsVehiculo> mostrarVehiculos() {
		
		ordenarVehiculos();
		
		return listaVehiculos;
		
	}
	
	/**
	 * metodo para visualizar la lista
	 * @return
	 */
	public ArrayList<itfProperty> VisualizarVehiculos(){
		
		ArrayList <itfProperty> retorno;
		retorno = new ArrayList <itfProperty>();
		for(clsVehiculo a:listaVehiculos) {
			
			retorno.add(a);
		}
		return retorno;
	}
	
	
	/**
	 * metodo para eliminar vehiculos del arraylist como de la base de datos
	 * @param matricula
	 * @throws SQLException
	 */
	public void eliminarVehiculo2(String matricula) throws SQLException {
		
		Iterator <clsVehiculo> iter = listaVehiculos.iterator();
		while(iter.hasNext()) {
			clsVehiculo objVehiculo = iter.next();
			if(objVehiculo.getMatricula().equals(matricula)) {
				
				iter.remove();
				objDatos.BorrarVehiculo(matricula);
			}
			
		}
		
		
	}
	
	/**
	 * metodo para comprobar si la lista de vehiculos esta vacia
	 * @throws clsListaVacia
	 */
	public void listaVacia() throws clsListaVacia {
		
		if(listaVehiculos.size() == 0) {
			
			throw new clsListaVacia();
			
		}
	}
	
	/**
	 * metodo para comprobar si ya existe un vehículo
	 * @param _vehiculo
	 * @return
	 */
	public static boolean Existe(clsVehiculo _vehiculo)
	{
		
		boolean retorno = false;
		
		for(itfProperty b:listaVehiculos) {
			
			if(b.equals(_vehiculo)) {
				
				return true;
			}
			
		}
		
		return retorno;
		
	}
	
	/**
	 * metodo que comprueba si hemos introducido un matricula repetida
	 * @param nuevoVehiculo
	 * @throws clsMatriculaVehiculoRepetida
	 */
	public static void comprobarMatricula(clsVehiculo vehiculo) throws clsMatriculaVehiculoRepetida {
		
		
		for (itfProperty d : listaVehiculos) {
			
			if(d.getProperty("Matricula").equals(vehiculo.getProperty("Matricula")) ) {
				
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
			
			if(objVehiculo.getPlazaVehiculo() == nuevoVehiculo.getPlazaVehiculo()  && objVehiculo.getZonaVehiculo().equalsIgnoreCase(nuevoVehiculo.getZonaVehiculo())) {
				
				throw new clsPlazaOcupada();
			}
		}
	}
	
	/**
	 * metodo que comprueba si la matricula que hemos metido tiene 7 digitos
	 * @param nuevoVehiculo
	 * @throws clsMatriculaIncorrecta
	 */
	public static void matriculaIncorrecta(clsVehiculo vehiculo) throws clsMatriculaIncorrecta {
			
			if (vehiculo.getMatricula().length() != 7) {
				
				throw new clsMatriculaIncorrecta();
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
