package LN;

import Comun.itfProperty;
import Excepciones.PropiedadInexistente;

/**
 * Clase creada para identificar el tipo de vehiculo que hay en la plaza.
 * Devuelve un boolean diciendo si es coche o si es moto
 * @author Industria 4.0
 *
 */

public class clsTipoVehiculo extends clsVehiculo implements itfProperty
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String TipoVehiculo;
	

	
	/**
	 *Constructor, Getters y setters de la clase
	 */
	
	public clsTipoVehiculo(String tipovehiculo, String matricula, String minusvalido, int plazaVehiculo, String ZonaVehiculo)
	{
	
		super(matricula, minusvalido, plazaVehiculo, ZonaVehiculo);
		this.TipoVehiculo = tipovehiculo;
		
	}



	public String getTipoVehiculo() {
		return TipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}



	@Override
	public String toString() {
		return "clsTipoVehiculo [TipoVehiculo=" + TipoVehiculo + "]";
	}
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "TipoVehiculo": return this.getTipoVehiculo();
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
		int result = super.hashCode();
		result = prime * result + ((TipoVehiculo == null) ? 0 : TipoVehiculo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsTipoVehiculo other = (clsTipoVehiculo) obj;
		if (TipoVehiculo == null) {
			if (other.TipoVehiculo != null)
				return false;
		} else if (!TipoVehiculo.equals(other.TipoVehiculo))
			return false;
		return true;
	}
	
	
	
	

}
