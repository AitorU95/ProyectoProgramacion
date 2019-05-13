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
	 * Constructor, Getters y setters de la clase
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
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "NumeroPlaza": return this.getNumeroPlaza();
			case "PlazaOcupada": return this.isPlazaOcupada();
			case "ZonaDeLaPlaza": return this.getZonaDeLaPlaza();
			default:
				throw new RuntimeException("Propiedad incorrecta");
		}
		
		
		
	}

	/**
	 * Codigo de los metodos hashcode y equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NumeroPlaza;
		result = prime * result + (PlazaOcupada ? 1231 : 1237);
		result = prime * result + ((ZonaDeLaPlaza == null) ? 0 : ZonaDeLaPlaza.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsPlaza other = (clsPlaza) obj;
		if (NumeroPlaza != other.NumeroPlaza)
			return false;
		if (PlazaOcupada != other.PlazaOcupada)
			return false;
		if (ZonaDeLaPlaza == null) {
			if (other.ZonaDeLaPlaza != null)
				return false;
		} else if (!ZonaDeLaPlaza.equals(other.ZonaDeLaPlaza))
			return false;
		return true;
	}
	
	
		
}
