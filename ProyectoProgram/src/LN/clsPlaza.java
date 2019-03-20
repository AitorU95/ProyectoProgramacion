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
	
	private boolean PlazaOcupada;
	private String MatriculaVehiculo;
	
	/**
	 * Getters y setters de la clase
	 */
	
	public boolean EstaLaPlazaOcupada() {
		return PlazaOcupada;
	}
	
	public void setPlazaOcupada(boolean plazaOcupada) {
		PlazaOcupada = plazaOcupada;
	}
	
	public String getMatriculaVehiculo() {
		return MatriculaVehiculo;
	}
	
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		MatriculaVehiculo = matriculaVehiculo;
	}
	
	

}
