package LD;

/**
 * clase que contiene las constantes para realizar las conexiones a base de datos
 * @author Industria 4.0
 *
 */

public class clsConstantesDB {
	

	/**
	 * constantes para acceder a la base de datos
	 */
	public static final String URL="jdbc:mysql://localhost:3306/";
	public static final String SCHEMA = "parking";
	public static final String TIME="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String USER = "root";
	public static final String PASS = "rotia1995";
	
	
	
	/**
	 * constante para realizar las inserts
	 */
	public static final String SQL_INSERT_VEHICULO = "INSERT INTO `mydb`.`vehiculo`\r\n" + 
			"(`Matricula`,\r\n" + 
			"`Minusvalido`,\r\n" + 
			"`Plaza_idPlaza`,\r\n" + 
			"`ZonaVehiculo`,\r\n" + 
			"`tipoVehiculo`)\r\n" + 
			"VALUES\r\n" + 
			"(?,?,?,?,?);";
	/**
	 * constantes para realizar las selects
	 */
	public static final String SQL_SELECT_VEHICULO = "SELECT FROM `mydb`.`vehiculo`;";
	/**
	 * constantes para realizar los deletes
	 */
	public static final String SQL_DELETE_VEHICULO = "DELETE FROM `mydb`.`vehiculo`\r\n" + 
			"WHERE Matricula = ?;";
	
	
	
	
	
	
	
	
	

}
