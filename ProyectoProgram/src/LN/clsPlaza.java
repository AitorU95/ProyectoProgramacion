package LN;

import Comun.itfProperty;

/**
 * Clase que contiene la informacion sobre la plaza.
 * La plaza puede estar ocupada o no y si lo estuviese se guardaria la matricula del vehiculo que la ocupa.
 * @author Industria 4.0
 *
 */

public class clsPlaza implements itfProperty
{
	
	/**
	 * Atributos de la clase
	 */
	
	private int NumeroPlaza	;
	private boolean PlazaOcupada;
	private String ZonaDeLaPlaza;
	
	/**
	 * Getters y setters de la clase
	 */
	
	public clsPlaza(int numeroPlaza, boolean plazaOcupada, String zonadelaPlaza) {
		
		this.NumeroPlaza = numeroPlaza;
		this.PlazaOcupada = plazaOcupada;
		this.ZonaDeLaPlaza = zonadelaPlaza;
	}

	public int getNumeroPlaza() {
		return NumeroPlaza;
	}

	public void setNumeroPlaza(int numeroPlaza) {
		NumeroPlaza = numeroPlaza;
	}

	public boolean isPlazaOcupada() {
		return PlazaOcupada;
	}

	public void setPlazaOcupada(boolean plazaOcupada) {
		PlazaOcupada = plazaOcupada;
	}

	public String getZonaDeLaPlaza() {
		return ZonaDeLaPlaza;
	}

	public void setZonaDeLaPlaza(String zonaDeLaPlaza) {
		ZonaDeLaPlaza = zonaDeLaPlaza;
	}

	@Override
	public String toString() {
		return "clsPlaza [NumeroPlaza=" + NumeroPlaza + ", PlazaOcupada=" + PlazaOcupada + ", ZonaDeLaPlaza="
				+ ZonaDeLaPlaza + "]";
	}
	
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "NumeroPlaza": return this.getNumeroPlaza();
			case "PlazaOcupada": return this.isPlazaOcupada();
			case "ZonaDeLaPlaza": return this.getZonaDeLaPlaza();
			default: return ""; //lanzar runtime exception
		}
		
		
		
	}
		
}
