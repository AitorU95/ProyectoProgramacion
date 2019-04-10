package LN;

/**
 * Clase que contiene información sobre la zona en la que se encuentran los vehículos dentro del parking.
 * Cada zona se identifica por una letra y todas tienen el mismo número de plazas.
 * @author Industria 4.0
 *
 */
public class clsZona
{
	
	/**
	 * Atributos de la clase
	 */
	
	private String LetraZona;
	private int PlazasCocheZona;
	private int PlazasMotoZona;
	private int PlazasMinusvalidoZona;
	
		
	/**
	 * Constructor, Getters y setters de los atributos
	 */
	
	public clsZona(String letraZona, int plazasCocheZona, int plazasMotoZona, int plazasMinusvalidoZona) {
		
		this.LetraZona = letraZona;
		this.PlazasCocheZona = plazasCocheZona;
		this.PlazasMotoZona = plazasMotoZona;
		this.PlazasMinusvalidoZona = plazasMinusvalidoZona;
	}


	public String getLetraZona() {
		return LetraZona;
	}


	public void setLetraZona(String letraZona) {
		LetraZona = letraZona;
	}


	public int getPlazasCocheZona() {
		return PlazasCocheZona;
	}


	public void setPlazasCocheZona(int plazasCocheZona) {
		PlazasCocheZona = plazasCocheZona;
	}


	public int getPlazasMotoZona() {
		return PlazasMotoZona;
	}


	public void setPlazasMotoZona(int plazasMotoZona) {
		PlazasMotoZona = plazasMotoZona;
	}


	public int getPlazasMinusvalidoZona() {
		return PlazasMinusvalidoZona;
	}


	public void setPlazasMinusvalidoZona(int plazasMinusvalidoZona) {
		PlazasMinusvalidoZona = plazasMinusvalidoZona;
	}


	@Override
	public String toString() {
		return "clsZona [LetraZona=" + LetraZona + ", PlazasCocheZona=" + PlazasCocheZona + ", PlazasMotoZona="
				+ PlazasMotoZona + ", PlazasMinusvalidoZona=" + PlazasMinusvalidoZona + "]";
	}
	
	
	



}
