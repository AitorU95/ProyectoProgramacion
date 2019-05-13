package Excepciones;

public class PropiedadInexistente extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	private final String Mensaje = "La propiedad no existe";
	public String getMessage() {
		
		return Mensaje;
	}

	public String toString() {
		
		return Mensaje;
	}

}
