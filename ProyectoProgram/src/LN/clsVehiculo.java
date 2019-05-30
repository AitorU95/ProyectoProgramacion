package LN;

import Comun.itfProperty;
import Excepciones.PropiedadInexistente;

/**
 * Clase que contiene la informacion sobre el vehiculo.
 * Identificamos que tipo de vehiculo es y si es minusvalido o no.
 * @author Industria 4.0
 *
 */

public class clsVehiculo implements itfProperty, Comparable<clsVehiculo>
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String Matricula;
	private String Minusvalido;
	private int PlazaVehiculo;
	private String ZonaVehiculo;
	private String tipoVehiculo;
	
	
	
	/**
	 * Constructor, getters y setter de la clase
	 */
	
	public clsVehiculo(String matricula) {
		
		super();
		
	}
	
	public clsVehiculo(String matricula, String minusvalido, int plazaVehiculo, String zonaVehiculo, String tipoVehiculo) {
		
		this.Matricula = matricula;
		this.Minusvalido = minusvalido;
		this.PlazaVehiculo = plazaVehiculo;
		this.ZonaVehiculo = zonaVehiculo;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String isMinusvalido() {
		return Minusvalido;
	}

	public void setMinusvalido(String minusvalido) {
		Minusvalido = minusvalido;
	}

	public Integer getPlazaVehiculo() {
		return PlazaVehiculo;
	}

	public void setPlazaVehiculo(int plazaVehiculo) {
		PlazaVehiculo = plazaVehiculo;
	}
	
	public String getZonaVehiculo() {
		return ZonaVehiculo;
	}

	public void setZonaVehiculo(String zonaVehiculo) {
		ZonaVehiculo = zonaVehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public String toString() {
		return "clsVehiculo [Matricula=" + Matricula + ", Minusvalido=" + Minusvalido + ", PlazaVehiculo="
				+ PlazaVehiculo + "]";
	}
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */

	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) 
		{
			case "Matricula": return this.getMatricula(); 
			case "Minusvalido": return this.isMinusvalido();
			case "PlazaVehiculo": return this.getPlazaVehiculo();
			case "ZonaVehiculo" : return this.getZonaVehiculo();
			case "TipoVehiculo" : return this.getTipoVehiculo();
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
		result = prime * result + ((Matricula == null) ? 0 : Matricula.hashCode());
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
		clsVehiculo other = (clsVehiculo) obj;
		if (Matricula == null) {
			if (other.Matricula != null)
				return false;
		} else if (!Matricula.equals(other.Matricula))
			return false;
		return true;
	}

	public int compareTo(clsVehiculo otro) {
		
		

		return Integer.compare(this.PlazaVehiculo, otro.PlazaVehiculo);
	

		
	}
	

}
