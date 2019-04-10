package LN;

/**
 * Clase creada para identificar el tipo de vehiculo que hay en la plaza.
 * Devuelve un boolean diciendo si es coche o si es moto
 * @author Industria 4.0
 *
 */

public class clsTipoVehiculo extends clsVehiculo
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String TipoVehiculo;
	

	
	/**
	 * Getters y setters de la clase
	 */
	
	public clsTipoVehiculo(String tipovehiculo, String matricula, boolean minusvalido, String plazaVehiculo)
	{
	
		super(matricula, minusvalido, plazaVehiculo);
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
	
	
	
	

}
