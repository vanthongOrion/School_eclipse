package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	public static ResultSet executeQuery(String query) {		
		String dbbase = "newdb", user = "root" , pass = "root";
		String url = "jdbc:mysql://localhost:3306/" + dbbase;
		Connection con = null;
		Statement st;
		ResultSet rs;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection(url,user,pass);
				st = con.createStatement();
				rs = st.executeQuery(query);
				return rs;

			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}
