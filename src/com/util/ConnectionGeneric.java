package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionGeneric {

	private static final long serialVersionUID = 1L;

	private static Connection c;

public static Connection connection;

public static void close(){
try {
connection.close();
}catch(Exception e){
e.printStackTrace();
}
}




public static Connection getConexion() {
try {
Class.forName(Variable.DRIVER_BD);
connection = (Connection) DriverManager.getConnection(Variable.URL_ONE, Variable.USER_BD, Variable.PASSWORD_BD);
System.out.println("Exitosa");
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
} catch (Exception e) {
e.printStackTrace();
}
return connection;

}


public static long getSerialversionuid() {
	return serialVersionUID;
}

public static Connection getC() {
	return c;
}

public static void setC(Connection c) {
	ConnectionGeneric.c = c;
}



}


