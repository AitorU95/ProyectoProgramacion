package LN;

import java.io.IOException;

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
	private int PlazaVehiculo;
	private String ZonaVehiculo;
	
	
	
	/**
	 * Constructor, getters y setter de la clase
	 */
	
	public clsVehiculo(String matricula, boolean minusvalido, int plazaVehiculo,String zonaVehiculo) {
		
		this.Matricula = matricula;
		this.Minusvalido = minusvalido;
		this.PlazaVehiculo = plazaVehiculo;
		this.ZonaVehiculo = zonaVehiculo;
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

	public Integer getPlazaVehiculo() {
		return PlazaVehiculo;
	}

	public void setPlazaVehiculo(int plazaVehiculo) {
		PlazaVehiculo = plazaVehiculo;
	}
	
	public String getZonaVehiculo() {
		return ZonaVehiculo;
	}

	public void setZonaVehiculo(String zonaVehiculo) {
		ZonaVehiculo = zonaVehiculo;
	}

	@Override
	public String toString() {
		return "clsVehiculo [Matricula=" + Matricula + ", Minusvalido=" + Minusvalido + ", PlazaVehiculo="
				+ PlazaVehiculo + "]";
	}
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */

	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) 
		{
			case "Matricula": return this.getMatricula();
			case "Minusvalido": return this.isMinusvalido();
			case "PlazaVehiculo": return this.getPlazaVehiculo();
			case "ZonaVehiculo" : return this.getZonaVehiculo();
			default:
				throw new RuntimeException("Propiedad incorrecta");
				
			
		}
		
	}
	
	/**
	 * Codigo de los metodos hashcode y equals
	 */
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
	
	
	public int compareTo(Object arg0) 
	{
		
		String zona = ZonaVehiculo;
		clsVehiculo objCast;
		
		if(arg0==null)
			throw new NullPointerException();
		if(arg0.getClass()!=this.getClass())
			throw new ClassCastException();
		
		
		objCast = (clsVehiculo)arg0;
		// TODO Auto-generated method stub
		return zona.compareTo(objCast.getZonaVehiculo());
		
		
		}
	

}
