package Excepciones;

public class clsMatriculaIncorrecta extends Exception{
	
	/**
	 * metodo que nos informa si una matr�cula no es correcta
	 */
	
	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE = "La matr�cula no es correcta, debe tener 7 caracteres";	
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
