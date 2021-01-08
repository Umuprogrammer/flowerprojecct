package nice.flowershop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbutil {

	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/myflowershop?user=root&password=root");
		}catch(SQLException e){
			e.printStackTrace();
    		return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}
	}
	public static void close(Connection connnection,Statement statement,ResultSet resultSet)
		{
			try {
				if(connnection!=null)
				{
				connnection.close();
				}
				if(statement!=null)
				{
					statement.close();
				}
				if(resultSet!=null)
				{
					resultSet.close();
				}
			}catch(Exception e)
				{
				e.printStackTrace();
				}
		}
	public static void close(Connection connnection,PreparedStatement statement,ResultSet resultSet)
		{
			try {
				if(connnection!=null)
				{
					connnection.close();
				}
				if(statement!=null)
				{
					statement.close();
				}
				if(resultSet!=null)
				{
					resultSet.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
