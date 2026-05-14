package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User {
	private int id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String phone;
	public User(){
		
	}
    public User(int id, String name, String email, String password, String lastname, String phone)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.phone = phone;
    }
	
    public ArrayList<User> get() {
		
		ArrayList<User> users = new ArrayList<>();
		String query = "SELECT * FROM users";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/application_db",
				"root",
				""
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				User tmp = new User();
				
				tmp.setId(rs.getInt("id"));
				tmp.setEmail(rs.getString("email"));
				tmp.setPhone(rs.getString("phone"));
				tmp.setName(rs.getString("name"));
				tmp.setLastname(rs.getString("lastname"));
				
				users.add(tmp);
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return users;
	}
	
	public boolean update(User user) {
		
		String query = "UPDATE users SET nombre = ?, correo = ?, telefono = ? WHERE id = ?";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/application_db",
				"root",
				"root"
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getLastname());
			ps.setString(5, user.getPhone());
			ps.setInt(6, user.getId());
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public boolean create(User user) {
		
		String query = "INSERT INTO users (name, email,password,lastname, phone) VALUES (?, ?, ?, ?, ?)";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/application_db",
				"root",
				""
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getLastname());
			ps.setString(5, user.getPhone());
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public boolean delete(int id) {
		
		String query = "DELETE FROM users WHERE id = ?";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/application_db",
				"root",
				"root"
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			int rowsAffected = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return rowsAffected > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {}
		}
		
		return false;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
