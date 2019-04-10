package LN;

import Comun.itfProperty;

/**
 * Clase Principal parking, la cual contiene la informacion general sobre el parking.
 * Contiene el numero total de plazas por tipo, al igual que el numero de pisos totales.
 * @author
 *
 */
public abstract class clsParking implements itfProperty
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
	

	
	



}
	
	
	


