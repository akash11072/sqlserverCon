package databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ConnectionUrl = "jdbc:sqlserver://INBOOK_X1_SLIM;databaseName =dataTable;integratedSecurity=true;encrypt=false";
		String user = "INBOOK_X1_SLIM\\Akash";
		String pwd = null;
		try {
			Connection con = DriverManager.getConnection(ConnectionUrl,user,pwd);
//			Connection con = DriverManager.getConnection(ConnectionUrl);
			Statement st = con.createStatement();
			String sqlstr = "select * from data1";
			ResultSet rs = st.executeQuery(sqlstr);
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}catch(SQLException e) {
			System.out.println("sorry brother ! please check the problem and come back");
			e.printStackTrace();
		}
		
		
	}

}
