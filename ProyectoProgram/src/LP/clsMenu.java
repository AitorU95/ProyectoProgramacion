package LP;

import java.util.ArrayList;

import Comun.itfProperty;
import LN.clsGestorLN;

/**
 * Menu Principal donde se desarrollaran las funcionalidades
 * @author Industria 4.0
 *
 */

public class clsMenu 
{
	
	
	public static void MenuPrincipal ()
	{
		clsGestorLN objGestor = new clsGestorLN();
		
		int op=0;
		
		
		System.out.println("Bienvenid@ al programa");
		
		do {
			
			System.out.println("Elige una opcion");
			System.out.println("1- Introduce los datos de un vehiculo");
			System.out.println("2- Muestra los datos introducidos");
			System.out.println("3- Salir del programa");
			op = UtilidadesLP.leerEntero();
			
			switch(op) {
			
			 case 1: NuevoVehiculo(objGestor);
			 	break;
			 
			 case 2: MostrarDatos(objGestor);
			 	break;
				
			}
			
		}while(op!=3);
		
		
		
		
	}
	
	private static void NuevoVehiculo(clsGestorLN objg)
	{
		
		System.out.println("Tipo de Vehiculo (coche o moto) ");
		String tipovehiculo = UtilidadesLP.leerCadena();
		
		System.out.println("¿Minusvalido? (si o no)");
		String respuesta = UtilidadesLP.leerCadena();
		boolean minusvalido;
		if (respuesta == "si") {
			minusvalido = true;
			
		}else {
			minusvalido = false;
		}
		
		System.out.println("Introduce la matricula");
		String matricula = UtilidadesLP.leerCadena();
		
		System.out.println("Introduce la letra de la zona en la que esta el vehiculo");
		String letra = UtilidadesLP.leerCadena();
		
		objg.AltaVehiculo(tipovehiculo, minusvalido, matricula, letra);
		
	}
	
	public static void MostrarDatos(clsGestorLN objG) {
		
		ArrayList<itfProperty> lista;
		
		lista = objG.MostrarVehiculos();
		
		for(itfProperty p:lista) {
			System.out.println(p.getProperty("MatriculaVehiculo"));
		
		}
		
	}
	

}
