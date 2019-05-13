package LN;

import Comun.itfProperty;
import Excepciones.PropiedadInexistente;

/**
 * Clase que contiene información sobre la zona en la que se encuentran los vehículos dentro del parking.
 * Cada zona se identifica por una letra y todas tienen el mismo número de plazas.
 * @author Industria 4.0
 *
 */
public class clsZona implements itfProperty 
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String LetraZona;
	private int PlazasCocheZona;
	private int PlazasMotoZona;
	private int PlazasMinusvalidoZona;
	
		
	/**
	 * Constructor, Getters y setters de los atributos
	 */
	
	public clsZona(String letraZona, int plazasCocheZona, int plazasMotoZona, int plazasMinusvalidoZona) {
		
		this.LetraZona = letraZona;
		this.PlazasCocheZona = plazasCocheZona;
		this.PlazasMotoZona = plazasMotoZona;
		this.PlazasMinusvalidoZona = plazasMinusvalidoZona;
	}


	public String getLetraZona() {
		return LetraZona;
	}


	public void setLetraZona(String letraZona) {
		LetraZona = letraZona;
	}


	public int getPlazasCocheZona() {
		return PlazasCocheZona;
	}


	public void setPlazasCocheZona(int plazasCocheZona) {
		PlazasCocheZona = plazasCocheZona;
	}


	public int getPlazasMotoZona() {
		return PlazasMotoZona;
	}


	public void setPlazasMotoZona(int plazasMotoZona) {
		PlazasMotoZona = plazasMotoZona;
	}


	public int getPlazasMinusvalidoZona() {
		return PlazasMinusvalidoZona;
	}


	public void setPlazasMinusvalidoZona(int plazasMinusvalidoZona) {
		PlazasMinusvalidoZona = plazasMinusvalidoZona;
	}


	@Override
	public String toString() {
		return "clsZona [LetraZona=" + LetraZona + ", PlazasCocheZona=" + PlazasCocheZona + ", PlazasMotoZona="
				+ PlazasMotoZona + ", PlazasMinusvalidoZona=" + PlazasMinusvalidoZona + "]";
	}
	
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "LetraZona": return this.getLetraZona();
			case "PlazasCocheZona": return this.getPlazasCocheZona();
			case "PlazasMotoZona": return this.getPlazasMotoZona();
			case "PlazasMinusvalidoZona" : return this.getPlazasMinusvalidoZona();
			default: 
				throw new PropiedadInexistente();
		}
		
		
		
	}
	
	/**
	 * Codigo de los metodos hashcode y equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LetraZona == null) ? 0 : LetraZona.hashCode());
		result = prime * result + PlazasCocheZona;
		result = prime * result + PlazasMinusvalidoZona;
		result = prime * result + PlazasMotoZona;
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
		clsZona other = (clsZona) obj;
		if (LetraZona == null) {
			if (other.LetraZona != null)
				return false;
		} else if (!LetraZona.equals(other.LetraZona))
			return false;
		if (PlazasCocheZona != other.PlazasCocheZona)
			return false;
		if (PlazasMinusvalidoZona != other.PlazasMinusvalidoZona)
			return false;
		if (PlazasMotoZona != other.PlazasMotoZona)
			return false;
		return true;
	}
	
	
	
	



}
