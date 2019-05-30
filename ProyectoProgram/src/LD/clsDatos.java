package LD;

import java.sql.*;

import static LD.clsConstantesDB.DRIVER;
import static LD.clsConstantesDB.PASS;
import static LD.clsConstantesDB.SCHEMA;
import static LD.clsConstantesDB.URL;
import static LD.clsConstantesDB.USER;
import static LD.clsConstantesDB.TIME;

import static LD.clsConstantesDB.SQL_INSERT_VEHICULO;
import static LD.clsConstantesDB.SQL_SELECT_VEHICULO;

/**
 * Clase para acceder a los datos
 *
 */
public class clsDatos {
	
	/**
	 * Objeto para crear la conexión a base de datos.
	 */
	Connection conn = null;
	
	/**
	 * Objeto para crear la consulta a base de datos.
	 */
	PreparedStatement ps = null;
	
	/**
	 * Objeto para devolver el resultado de la consulta.
	 */
	ResultSet rs = null;
	
	
	public clsDatos()
	{
		//
	}
	
	/**
	 * Método para la conexión a la base de datos.
	 * 
	 */
	public Connection conectarBD() throws SQLException {
		
        Connection objConn = null;

        
        	
        	objConn = DriverManager.getConnection (URL, USER, PASS);
        
        

        return objConn;

	}
	 
	/**
	 * metodo para la desconexion a base de datos 
	 * @throws SQLException
	 */
	public void desconectarBD() throws SQLException {
		Connection conexion = null;
        	
        	conexion.close();
        	
	}
	 
	/**
	 * metodo para la insercion de vehiculos a la base de datos
	 * @param matricula
	 * @param minusvalido
	 * @param plazaVehiculo
	 * @param ZonaVehiculo
	 * @param tipoVehiculo
	 * @throws SQLException
	 */
	 public static void InsertarVehiculo(String matricula, String minusvalido, int plazaVehiculo, String ZonaVehiculo, String tipoVehiculo) throws SQLException {
		 
		 // Instancias la clase que hemos creado anteriormente
			clsDatos objDatos = new clsDatos();

			// Llamas al método que tiene la clase y te devuelve una conexión
			Connection objConn = objDatos.conectarBD();
		 
			if (objConn != null) {
				// Preparamos la insert
				String query = SQL_INSERT_VEHICULO;
				// Creamos las preparedstaments
				PreparedStatement objSt = objConn.prepareStatement(query);
				objSt.setString(1, matricula);
				objSt.setString(2, minusvalido);
				objSt.setInt(3, plazaVehiculo);
				objSt.setString(4, ZonaVehiculo);
				objSt.setString(5, tipoVehiculo);

				// Ejecutamos la query que hemos preparado
				objSt.execute();

				// Cerramos el preparedStatement
				objSt.close();

				// Cerramos la conexión
				objConn.close();

			}
	 }
	 
	 /**
	  * metodo para eliminar vehiculos de la base de datos
	  * @param matricula
	  * @throws SQLException
	  */
	 public void BorrarVehiculo(String matricula) throws SQLException {
		 
		// Instancias la clase que hemos creado anteriormente
			clsDatos objDatos = new clsDatos();

			// Llamas al método que tiene la clase y te devuelve una conexión
			Connection objConn = objDatos.conectarBD();

			if (objConn != null) {
				// Preparamos el delete
				String query = "DELETE FROM `mydb`.`vehiculo`\\r\\n\" + \r\n" + 
						"\"WHERE Matricula = ?;";

				// Creamos las preparedstaments
				PreparedStatement objSt = objConn.prepareStatement(query);
				objSt.setString(1, matricula);

				// Ejecutamos la query que hemos preparado
				objSt.execute();

				// Cerramos el preparedStatement
				objSt.close();

				// Cerramos la conexión
				objConn.close();

			}

		 
	 }
	 
	 /**
	  * metodo para realizar la consulta a la base de datos
	  * @return
	  * @throws SQLException
	  */
	 
	 public ResultSet ConsultarVehiculos() throws SQLException {
		 
		 
		 ResultSet rs = null;
		// Instancias la clase que hemos creado anteriormente
		clsDatos objDatos = new clsDatos();

		// Llamas al método que tiene la clase y te devuelve una conexión
		Connection objConn = objDatos.conectarBD();

		if (objConn != null) {
			// Preparamos la consulta
			Statement st = objConn.createStatement();
			rs = st.executeQuery(SQL_SELECT_VEHICULO);
			

		}
		
		return rs;
		
	 }
	 

}
