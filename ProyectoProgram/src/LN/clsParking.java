package LN;

import Comun.itfProperty;

/**
 * Clase Principal parking, la cual contiene la informacion general sobre el parking.
 * Contiene el numero total de plazas por tipo, al igual que el numero de pisos totales.
 * @author
 *
 */
public class clsParking implements itfProperty
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String NombreParking;
	private int PlazasCochesTotales;
	private int PlazasMotosTotales;
	private int PlazasMinusvalidosTotales;
	private int ZonasTotales;
	
	
	/**
	 * Contrusctores, getters y setters de los atributos
	 */
	
	
	public clsParking(String nombreparking, int plazasCochesTotales, int plazasMotosTotales, int plazasMinusvalidosTotales,int zonasTotales)
	{
		
		this.NombreParking = nombreparking;
		this.PlazasCochesTotales= plazasCochesTotales;
		this.PlazasMotosTotales = plazasMotosTotales;
		this.PlazasMinusvalidosTotales = plazasMinusvalidosTotales;
		this.ZonasTotales = zonasTotales;
	}
	
	
	
	
	public String getNombreParking() {
		return NombreParking;
	}
	public void setNombreParking(String nombreParking) {
		NombreParking = nombreParking;
	}

	public int getPlazasCochesTotales() {
		return PlazasCochesTotales;
	}
	
	public void setPlazasCochesTotales(int plazasCochesTotales) {
		PlazasCochesTotales = plazasCochesTotales;
	}
	public int getPlazasMotosTotales() {
		return PlazasMotosTotales;
	}
	public void setPlazasMotosTotales(int plazasMotosTotales) {
		PlazasMotosTotales = plazasMotosTotales;
	}
	public int getPlazasMinusvalidosTotales() {
		return PlazasMinusvalidosTotales;
	}
	public void setPlazasMinusvalidosTotales(int plazasMinusvalidosTotales) {
		PlazasMinusvalidosTotales = plazasMinusvalidosTotales;
	}
	public int getZonasTotales() {
		return ZonasTotales;
	}
	public void setZonasTotales(int zonasTotales) {
		ZonasTotales = zonasTotales;
	}




	@Override
	public String toString() {
		return "clsParking [NombreParking=" + NombreParking + ", PlazasCochesTotales=" + PlazasCochesTotales
				+ ", PlazasMotosTotales=" + PlazasMotosTotales + ", PlazasMinusvalidosTotales="
				+ PlazasMinusvalidosTotales + ", ZonasTotales=" + ZonasTotales + "]";
	}
	
	/**
	 * Implementacion de la interfaz itfProperty para sacar los datos de un objeto de la clase
	 */
	
	public Object getProperty(String propiedad)
	{
		
		switch(propiedad) {
			case "NombreParking": return this.getNombreParking();
			case "PlazasCochesTotales": return this.getPlazasCochesTotales();
			case "PlazasMotosTotales": return this.getPlazasMotosTotales();
			case "PlazasMinusvalidos" : return this.getPlazasMinusvalidosTotales();
			case "ZonasTotales": return this.getZonasTotales();
			default: return ""; //lanzar runtime exception
		}
		
		
		
	}

	/**
	 * Codigo de los metodos hashcode y equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NombreParking == null) ? 0 : NombreParking.hashCode());
		result = prime * result + PlazasCochesTotales;
		result = prime * result + PlazasMinusvalidosTotales;
		result = prime * result + PlazasMotosTotales;
		result = prime * result + ZonasTotales;
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
		clsParking other = (clsParking) obj;
		if (NombreParking == null) {
			if (other.NombreParking != null)
				return false;
		} else if (!NombreParking.equals(other.NombreParking))
			return false;
		if (PlazasCochesTotales != other.PlazasCochesTotales)
			return false;
		if (PlazasMinusvalidosTotales != other.PlazasMinusvalidosTotales)
			return false;
		if (PlazasMotosTotales != other.PlazasMotosTotales)
			return false;
		if (ZonasTotales != other.ZonasTotales)
			return false;
		return true;
	}
	
	
	

	
	



}
	
	
	


