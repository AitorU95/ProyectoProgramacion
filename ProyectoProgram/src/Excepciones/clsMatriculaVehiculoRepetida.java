package Excepciones;

public class clsMatriculaVehiculoRepetida extends Exception 
{
	
	/**
	 * método que nos informa si existen dos vehículos con la misma mátricula
	 */
	
	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE = "Ya existe un vehículo con esa matrícula";	
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
