package nice.flowershop.oda;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import nice.flowershop.model.User;
import nice.flowershop.util.Dbutil;

public class UserODA {

	public String getuserId(User user,boolean is_loggedin) 
	{ String id=new String();
		try {
		String sql="select userId from users where username=?  and "+is_loggedin+"";
		Connection conn=Dbutil.getConnection();
		
		PreparedStatement pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		id=Integer.toString(rs.getInt("userId"));
		Dbutil.close(conn, pstmt, rs);
		
		}
	catch(SQLException err) {
		err.printStackTrace();
	}catch(Exception err) {
		err.printStackTrace();
	}
		return id;
		
	}
	
	
	public static boolean login(User user) 
	{int count=0;
		try {
		String sql="select count(*) from users where username=? and passwrd=?";
		Connection conn=Dbutil.getConnection();
		
		PreparedStatement pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPasswrd());
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		count=rs.getInt(1);
		Dbutil.close(conn, pstmt, rs);
		
		}
	catch(SQLException err) {
		err.printStackTrace();
	}catch(Exception err) {
		err.printStackTrace();
	}
		if(count>0)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public boolean addUser(User user)
	{
		String sql="insert into users(fullname,gender,birthday,username,email,phonenumbeer,passwrd) values(?,?,?,?,?,?,?)";
		int count=0;
		
		Connection conn=Dbutil.getConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, user.getFullname());
		pstmt.setString(2, user.getGender());
		pstmt.setString(3, user.getBirthday());
		pstmt.setString(4, user.getUsername());
		pstmt.setString(5, user.getEmail());
		pstmt.setString(6, user.getPhonenumbeer());
		pstmt.setString(7, user.getPasswrd());
		
		
	count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {Dbutil.close(conn, pstmt, null);}
		if(count>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static ArrayList<User> getUsers() 
	{
		ArrayList<User> users=new ArrayList<User>();
		String sql="select * from users";
		Connection conn=Dbutil.getConnection();
		PreparedStatement pstmt= null;
		ResultSet rs=null;
		try {
		 pstmt= conn.prepareStatement(sql);
		
		
			rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			users.add(new User(rs.getInt("userId"),rs.getString("fullname"),rs.getString("gender"),
								rs.getString("birthday"),rs.getString("username"),rs.getString("email")
								,rs.getString("phonenumbeer"),rs.getString("passwrd")));
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dbutil.close(conn, pstmt, rs);
		return users;
		
	}
	public static void main(String args[])
	{
		UserODA oda=new UserODA();
		User user=new User("test 22222222222","male", "2021-01-01", "test2", "tttttttt@admin.com","111111111","password");
		
			//System.out.println(oda.addUser(user)?"successfully added a user":"failed to add userr");
		
		System.out.println(oda.getuserId(user,oda.login(user)));
		
	}

}
