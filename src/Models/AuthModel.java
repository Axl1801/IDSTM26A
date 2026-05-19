package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AuthModel {

	public AuthModel() {
		
	}
	
	public boolean login(String user,String password) {
		
		
		String query = "SELECT * FROM users WHERE name = ? AND password = ?";
		
		System.out.println(query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		    conn = DriverManager.getConnection(
				"jdbc:mysql://sql.freedb.tech:3306/freedb_FwTcWRQK",
				"u_Zn8DwG",
				"EaB5UTrE4VIL"
		    );

		    PreparedStatement ps = conn.prepareStatement(query);
		    ps.setString(1, user.trim());
		    ps.setString(2, password.trim());

		    ResultSet rs = ps.executeQuery();
			
		    if (rs.next()) {
		    	 
		        return true;
		    }  
			
		    rs.close();
		    ps.close();
		    conn.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return false; 
	}

	public boolean registro(String user,String password, String nombre_completo) {
		
		
		String query = "INSERT INTO users (username, password, nombre_completo) VALUES (?, ?, ?)";
		
		System.out.println(query);
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		    conn = DriverManager.getConnection(
				"jdbc:mysql://sql.freedb.tech:3306/freedb_FwTcWRQK",
				"u_Zn8DwG",
				"EaB5UTrE4VIL"
		    );

		    PreparedStatement ps = conn.prepareStatement(query);
		    ps.setString(1, user.trim());
		    ps.setString(2, password.trim());
		    ps.setString(3, nombre_completo.trim());
		    
		    int rs = ps.executeUpdate();

		    if (rs > 0) {
		        return true;
		    } 
			
		    ps.close();
		    conn.close();
		    
		} catch (Exception e) {
	        e.printStackTrace();
	        return false;
		} finally {
			try {
				conn.close();
			} catch (Exception e) {}
		}
		
		return false; 
	}
}