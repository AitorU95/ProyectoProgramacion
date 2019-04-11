package Excepciones;

public class clsMatriculaVehiculoRepetida extends Exception 
{
	
	/**
	 * m�todo que nos informa si existen dos veh�culos con la misma m�tricula
	 */
	
	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE = "Ya existe un veh�culo con esa matr�cula";	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}
	
	
}
