package LN;

/**
 * Clase que contiene informaci�n sobre la zona en la que se encuentran los veh�culos dentro del parking.
 * Cada zona se identifica por una letra y todas tienen el mismo n�mero de plazas.
 * @author Industria 4.0
 *
 */
public abstract class clsZona extends clsParking {
	
	/**
	 * Atributos de la clase
	 */
	private int PlazasZona;
		
	/**
	 * Getters y setters de los atributos
	 * @return
	 */

	public int getPlazasZona() {
		return PlazasZona;
	}

	public void setPlazasZona(int plazasZona) {
		PlazasZona = plazasZona;
	}
	
	

	
	
	
	

}
