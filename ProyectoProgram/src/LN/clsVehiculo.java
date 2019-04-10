package LN;

import Comun.itfProperty;

/**
 * Clase que contiene la informacion sobre el vehiculo.
 * Identificamos que tipo de vehiculo es y si es minusvalido o no.
 * @author Industria 4.0
 *
 */

public class clsVehiculo implements itfProperty
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String Matricula;
	private boolean Minusvalido;
	private String PlazaVehiculo;
	
	
	
	/**
	 * Constructor, getters y setter de la clase
	 */
	
	public clsVehiculo(String matricula, boolean minusvalido, String plazaVehiculo) {
		
		this.Matricula = matricula;
		this.Minusvalido = minusvalido;
		this.PlazaVehiculo = plazaVehiculo;
	}
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public boolean isMinusvalido() {
		return Minusvalido;
	}

	public void setMinusvalido(boolean minusvalido) {
		Minusvalido = minusvalido;
	}

	public String getPlazaVehiculo() {
		return PlazaVehiculo;
	}

	public void setPlazaVehiculo(String plazaVehiculo) {
		PlazaVehiculo = plazaVehiculo;
	}
	

	@Override
	public String toString() {
		return "clsVehiculo [Matricula=" + Matricula + ", Minusvalido=" + Minusvalido + ", PlazaVehiculo="
				+ PlazaVehiculo + "]";
	}
	

	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "Matricula": return this.getMatricula();
			case "Minusvalido": return this.isMinusvalido();
			case "MatriculaVehiculo": return this.getPlazaVehiculo();
		}
		
		return getMatricula();
		
		
		
		
		
	}




	
	

}
