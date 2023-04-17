import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static String USERNAME ="root";
	private static String PASSWORD = "Admin@9595";
	private static String conn="jdbc:mysql://localhost:3306/amit?useSSL=false";
	public static Connection getConnection(DBType a ) throws SQLException
	{
		return DriverManager.getConnection(conn,USERNAME,PASSWORD);
		
	}
}
