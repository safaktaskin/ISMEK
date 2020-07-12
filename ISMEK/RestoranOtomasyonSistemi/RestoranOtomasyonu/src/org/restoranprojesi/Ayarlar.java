package org.restoranprojesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ayarlar {

	public static final String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	
	public static final Connection getConnection() throws SQLException, ClassNotFoundException {
	Class.forName(Ayarlar.mysqlDriver);
	return DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/restoransemasi?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
			"root", "1234");
	}

}
