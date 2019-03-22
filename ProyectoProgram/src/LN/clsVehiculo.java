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
	
	public clsVehiculo(String tipovehiculo, boolean minusvalido, String matricula, String letrazona) {
		super(matricula, letrazona);
		
		this.TipoVehiculo = tipovehiculo;
		this.Minusvalido = minusvalido;
		
	}
	
	/**
	 * Getters y setter de la clase
	 */
	
	public String getTipoVehiculo() {
		return TipoVehiculo;
	}
	
	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
	
	public boolean getMinusvalido() {
		return Minusvalido;
	}
	
	public void setMinusvalido(boolean minusvalido) {
		Minusvalido = minusvalido;
	}
	
	public Object getProperty(String propiedad) {
		
		switch(propiedad) {
			case "TipoVehiculo": return this.getTipoVehiculo();
			case "Minusvalido": return this.getMinusvalido();
			case "MatriculaVehiculo": return this.getMatriculaVehiculo();
			
			
		}
		
		return getMatriculaVehiculo();
		
		
	}

}
