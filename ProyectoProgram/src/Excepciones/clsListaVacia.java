package Excepciones;

public class clsListaVacia extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String MENSAJE = "La lista de libros se encuentra vacía, por favor, introduce un libro";	
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
