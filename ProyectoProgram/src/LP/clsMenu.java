package LP;

import java.util.ArrayList;



import Comun.itfProperty;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;
import Excepciones.clsMatriculaIncorrecta;
import LN.clsGestorLN;

/**
 * Menu Principal donde se desarrollaran las funcionalidades
 * @author Industria 4.0
 *
 */

public class clsMenu 
{
	
	
	public static void MenuPrincipal () throws clsPlazaOcupada, clsMatriculaIncorrecta
	{
		
		/**
		 * Creamos los distintos objetos con los que trabajara la aplicacion para crear los distintos objetos
		 */
		clsGestorLN objGestorParking = new clsGestorLN();
		clsGestorLN objGestorZona = new clsGestorLN();
		clsGestorLN objGestorPlaza = new clsGestorLN();
		clsGestorLN objGestorVehiculo = new clsGestorLN();
		
		int op=0;
		
		/**
		 * Creamos el cuerpo del programa que mostrara las opciones a efectuar y que el usuario sigue paso a paso
		 */
		
		System.out.println("Bienvenid@ al programa");
		
		do
		{
			
			System.out.println("Elige una opcion");
			System.out.println("1- Crea tu Parking");
			System.out.println("2- Salir del programa");
			op = UtilidadesLP.leerEntero();
			
			switch(op)
			{
			
			 case 1:
				 
				 System.out.println("Vamos a introducir los datos del Parking");
				 NuevoParking(objGestorParking);
				 
				 do {
					 System.out.println("Introduce una zona del parking");
					 NuevaZona(objGestorZona);
					 System.out.println("Elige una opción:");
					 System.out.println("1 - Crear una zona nueva en nuestro parking");
					 System.out.println("2 - Visualizar las zonas existentes y elegir una para crear una plaza");
					 op = UtilidadesLP.leerEntero();
					 
				 }while (op != 2);
				 
				 do {
					 
					 MostrarZonas(objGestorZona);
					 System.out.println("Elige una zona de las existentes");
					 String letra = UtilidadesLP.leerCadena();
					 System.out.println("Creamos una plaza en esa zona");
					 NuevaPlaza(objGestorPlaza, letra);
					 System.out.println("Elige una opcion: ");
					 System.out.println("1 - Crear una plaza en una zona existente");
					 System.out.println("2- Visualizar plazas creadas e introducir un vehiculo en una de ellas");
					 op = UtilidadesLP.leerEntero();
					 
				 }while(op != 2);
				 
				 do {
					 
					 MostrarPlazas(objGestorPlaza);
					 System.out.println("Elige una de las plazas existentes y su zona (introduce primero la zona y luego la plaza");
					 String zona = UtilidadesLP.leerCadena();
					 int plaza = UtilidadesLP.leerEntero();
					 System.out.println("Introduimos los datos del vehiculo");
					 NuevoVehiculo(objGestorVehiculo, zona, plaza);
					 System.out.println("Elige una opción: ");
					 System.out.println("1 - Introducir un vehiculo nuevo");
					 System.out.println("2- Mostrar todos lo vehiculos estacionados en el parking");
					 op = UtilidadesLP.leerEntero();
					 
				 }while(op != 2);
				 
				 MostrarVehiculos(objGestorVehiculo);
				 
		
			}
			
		}while(op!=2);
			
	}
	
	/**
	 * metodo para generar los datos de un parking
	 * 
	 */
	
	private static void NuevoParking(clsGestorLN objg) {
		
		System.out.println("Introduce el nombre del Parking");
		String nombre = UtilidadesLP.leerCadena();
		
		System.out.println("Introduce el numero total de plazas de coche");
		int plazascoche = UtilidadesLP.leerEntero();
		
		System.out.println("Introduce el numero total de plazas de moto");
		int plazasmoto = UtilidadesLP.leerEntero();
		
		System.out.println("Introduce el numero total de plazas de minusvalidos");
		int plazasminusvalido = UtilidadesLP.leerEntero();
		
		System.out.println("Introduce el numero de zonas totales");
		int numerozonas = UtilidadesLP.leerEntero();
		
		objg.InsertarDatosParking(nombre, plazascoche, plazasmoto, plazasminusvalido, numerozonas);
		
	}
	
	/**
	 * metodo para generar una nueva zona
	 * @param objg
	 */
	
	private static void NuevaZona (clsGestorLN objg) {
		
		System.out.println("Introduce la letra de la zona");
		String letra = UtilidadesLP.leerCadena();
		
		System.out.println("Introduce las plazas de coche de la zona");
		int plazascochezona = UtilidadesLP.leerEntero();
		
		System.out.println("Introduce las plazas de moto de la zona");
		int plazasmotozona = UtilidadesLP.leerEntero();
		
		System.out.println("Introduce las plazas de minusvalido de la zona");
		int plazasminusvalidozona = UtilidadesLP.leerEntero();
		
		objg.InsertarZona(letra, plazascochezona, plazasmotozona, plazasminusvalidozona);
	}
	
	/**
	 * método para mostrar las zonas existentes
	 * @param objG
	 */
	
	public static void MostrarZonas(clsGestorLN objG){
	
		ArrayList<itfProperty> lista;
		
		lista = objG.VisualizarZonas();
		
		for(itfProperty p:lista) {
			System.out.println("Zona: " + p.getProperty("LetraZona"));
		
		}	
	}
	
	/**
	 * metodo para generar una plaza nueva
	 * @param objg
	 * @param letra
	 */
	
	private static void NuevaPlaza(clsGestorLN objg, String letra) {
		
		System.out.println("Introduce el numero de la plaza");
		int numerplaza = UtilidadesLP.leerEntero();
		
		System.out.println("¿Esta la plaza ocupada (si/no) ?");
		String respuesta = UtilidadesLP.leerCadena();
		boolean plazaocupada;
		if (respuesta == "si") {
			plazaocupada = true;
			
		}else {
			plazaocupada = false;
		}
		
		objg.InsertarPlaza(numerplaza, plazaocupada, letra);
	}
	
	/**
	 * metodo para mostrar las plazas existentes
	 * @param objG
	 */
	
	public static void MostrarPlazas(clsGestorLN objG){
		
		ArrayList<itfProperty> lista;
		
		lista = objG.VisualizarPlazas();
		
		for(itfProperty p:lista) {
			System.out.println("Plaza " + p.getProperty("NumeroPlaza") + " en la zona " +  p.getProperty("ZonaDeLaPlaza"));
		
		}	
	}
	
	/**
	 * metodo para añadir vehiculos nuevos
	 * @param objg
	 * @param zona
	 * @param letra
	 * @throws clsPlazaOcupada
	 * @throws clsMatriculaIncorrecta
	 */
	
	private static void NuevoVehiculo(clsGestorLN objg, String zona, int letra) throws clsPlazaOcupada, clsMatriculaIncorrecta
	{
		
		System.out.println("Introduce la Matricula");
		String matricula = UtilidadesLP.leerCadena();
		
		System.out.println("¿Minusvalido? (si o no)");
		String respuesta = UtilidadesLP.leerCadena();
		
		boolean minusvalido;
		if (respuesta == "si") {
			minusvalido = true;
			
		}else {
			minusvalido = false;
		}
		
		try {
			objg.AltaVehiculo(matricula, minusvalido, letra, zona);
			
		} catch (clsMatriculaVehiculoRepetida e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	/**
	 * metodo que muestra los objetos existentes
	 * @param objG
	 */
	
	public static void MostrarVehiculos(clsGestorLN objG)
	{
	
		
		ArrayList<itfProperty> lista;
		
		lista = objG.MostrarVehiculos();
		
		for(itfProperty p:lista) {
			System.out.println("Vehiculo con matricula " + p.getProperty("Matricula") + " en plaza " +  p.getProperty("PlazaVehiculo") + " en zona " + p.getProperty("ZonaVehiculo"));
			
		
		}
		
		
		
	}
	

}
