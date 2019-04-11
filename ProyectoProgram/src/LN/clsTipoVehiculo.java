package LN;

import Comun.itfProperty;

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
	 * Getters y setters de la clase
	 */
	
	public clsTipoVehiculo(String tipovehiculo, String matricula, boolean minusvalido, int plazaVehiculo, String ZonaVehiculo)
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
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "TipoVehiculo": return this.getTipoVehiculo();
			default: return ""; //lanzar runtime exception
		}
		
		
		
	}
	
	

}
