package LD;

public class clsConstantesDB {
	

	//CONSTANTES PARA LA CREACIÓN DEL ACCESO A BASE DE DATOS.
	public static final String URL="jdbc:mysql://localhost:3306/";
	public static final String SCHEMA = "parking";
	public static final String TIME="?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String USER = "root";
	public static final String PASS = "rotia1995";
	
	
	
	
	public static final String SQL_INSERT_VEHICULO = "INSERT INTO `mydb`.`vehiculo`\r\n" + 
			"(`Matricula`,\r\n" + 
			"`Minusvalido`,\r\n" + 
			"`Plaza_idPlaza`,\r\n" + 
			"`ZonaVehiculo`)\r\n" + 
			"VALUES\r\n" + 
			"(?,?,?,?);\r\n";
	
	public static final String SQL_SELECT_VEHICULO = "SELECT `vehiculo`.`Matricula`,\r\n" + 
			"    `vehiculo`.`Minusvalido`,\r\n" + 
			"    `vehiculo`.`Plaza_idPlaza`,\r\n" + 
			"    `vehiculo`.`ZonaVehiculo`\r\n" + 
			"FROM `mydb`.`vehiculo`;";
	
	public static final String SQL_DELETE_VEHICULO = "DELETE FROM `mydb`.`vehiculo`";
	
	
	
	
	
	
	
	
	

}
