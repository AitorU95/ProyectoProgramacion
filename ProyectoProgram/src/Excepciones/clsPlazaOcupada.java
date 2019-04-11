package Excepciones;

public class clsPlazaOcupada extends Exception {
	
	/**
	 * metodo que nos informa si una plaza está ocupada
	 */
	
	private static final long serialVersionUID = 1L;
	
		private final String MENSAJE = "Ya hay un vehículo es esa plaza";	
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
