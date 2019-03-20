package LP;

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
		clsGestorLN objGEstor = new clsGestorLN();
		
		int op=0;
		
		
		
		switch(op)
		{
		
		case 1:Opcion1(objGEstor); 
		
		
		}
		
		
		
		
		
	}
	
	private static void Opcion1(clsGestorLN g)
	{
		
		System.out.println("Dine matrucula");
		String mat = UtilidadesLP.leerCadena();
		
		System.out.println("Dime num plaza");
		int nump = UtilidadesLP.leerEntero();
		
		g.AltaPlaza(mat, nump);
		
	}
	
	

}
