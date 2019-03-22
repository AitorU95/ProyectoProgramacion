package LN;

/**
 * Clase creada para identificar el tipo de vehiculo que hay en la plaza.
 * Devuelve un boolean diciendo si es coche o si es moto
 * @author Industria 4.0
 *
 */

public class clsTipoVehiculo extends clsVehiculo {
	
	

	/**
	 * Atributos de la clase
	 */
	
	private boolean Coche;
	private boolean Moto;
	
	public clsTipoVehiculo(String tipovehiculo, boolean minusvalido, String matricula, String letrazona, boolean coche, boolean moto) {
		super(tipovehiculo, minusvalido, matricula, letrazona);
		this.Coche = coche;
		this.Moto = moto;
		
	}
	
	/**
	 * Getters y setters de la clase
	 */
	
	public boolean getCoche() {
		return Coche;
	}
	
	public void setCoche(boolean coche) {
		Coche = coche;
	}
	
	public boolean getMoto() {
		return Moto;
	}
	
	public void setMoto(boolean moto) {
		Moto = moto;
	}
	
	

}
