package LN;

/**
 * Clase que contiene la informacion sobre la plaza.
 * La plaza puede estar ocupada o no y si lo estuviese se guardaria la matricula del vehiculo que la ocupa.
 * @author Industria 4.0
 *
 */

public class clsPlaza extends clsZona {
	
	/**
	 * Atributos de la clase
	 */
	
	private String MatriculaVehiculo;
	private String letraZona;
	
	public clsPlaza (String matricula, String letradezona) {
		this.MatriculaVehiculo = matricula;
		this.letraZona = letradezona;
		
	}
	
	/**
	 * Getters y setters de la clase
	 */
	

	
	public String getMatriculaVehiculo() {
		return MatriculaVehiculo;
	}
	
	public String getLetraZona() {
		return letraZona;
	}

	public void setLetraZona(String letraZona) {
		this.letraZona = letraZona;
	}

	public void setMatriculaVehiculo(String matriculaVehiculo) {
		MatriculaVehiculo = matriculaVehiculo;
	}
	
	public Object getProperty(String propiedad) {
		
		switch(propiedad) {
			case "MatriculaVehiculo": return this.getMatriculaVehiculo();
			case "letraZona": return this.getLetraZona();
			
			
		}
		
		return getMatriculaVehiculo();
		
		
	}
	
	

	
	

}
