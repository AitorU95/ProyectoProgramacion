package LN;


/**
 * Clase que contiene la informacion sobre el vehiculo.
 * Identificamos que tipo de vehiculo es y si es minusvalido o no.
 * @author Industria 4.0
 *
 */

public class clsVehiculo extends clsPlaza{
	
	
	/**
	 * Atributos de la clase
	 */
	
	private String TipoVehiculo;
	private boolean Minusvalido;
	
	/**
	 * Getters y setter de la clase
	 */
	
	public String getTipoVehiculo() {
		return TipoVehiculo;
	}
	
	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
	
	public boolean isMinusvalido() {
		return Minusvalido;
	}
	
	public void setMinusvalido(boolean minusvalido) {
		Minusvalido = minusvalido;
	}
	
	

}
