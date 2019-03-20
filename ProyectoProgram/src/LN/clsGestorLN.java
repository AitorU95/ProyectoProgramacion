package LN;

import java.util.ArrayList;

/**
 * Clase que sirve de enlace entre la LP y la LN
 */


public class clsGestorLN 
{
	
	ArrayList<clsPlaza> listaPlazas;
	
	public clsGestorLN()
	{
		listaPlazas=new ArrayList<clsPlaza>();
		
	}
	
	
	public void AltaPlaza (String mat, int numPlaza)
	{
		
		clsPlaza objPlaza = new clsPlaza();
		objPlaza.setMatriculaVehiculo(mat);
		objPlaza.setPlazasZona(numPlaza);
		
		listaPlazas.add(objPlaza);
		
	}
	

	
}
