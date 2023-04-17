package java7test;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Main {
	private static String USERNAME ="root";
	private static String PASSWORD = "Admin@9595";
	private static String conn="jdbc:mysql://localhost:3306/amit?useSSL=false";
	public static void main(String[] args) throws SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con =null;
		Statement s1=null;
		ResultSet r1=null;
		
		
		
		try {
			
			
			con = DriverManager.getConnection(conn,USERNAME,PASSWORD);
			s1=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			r1=s1.executeQuery("select * from info");
			r1.last();
			System.out.println("Number of Rows: "+r1.getRow());
			
			System.out.print("connect");
		} catch (SQLException e) {
			System.out.print(e);
		}
		finally
		{
			if(con!=null)
			{
				con.close();
			}
			if(s1!=null)
				s1.close();
			if(r1!=null)
				r1.close();
		}
	}
	
	}
//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?useSSL=false", "root", "123456");