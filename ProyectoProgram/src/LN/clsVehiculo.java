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

}
