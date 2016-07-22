package cn.itsource._10Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class JdbcCon {
	static Properties p=null;
	static JdbcCon instance=null;
	static{
		p=new Properties();
	}
	static{
		try {
				p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("cn/itsource/_10Jdbc/jdbc.properties"));
				Class.forName(p.getProperty("driver"));
				instance=new JdbcCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public JdbcCon(){}
	public static JdbcCon getInstance(){
	
		return instance;
	}
	public  Connection getcon(){
		System.out.println("------连接成功");
		try {
			return DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("pwd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public void close(ResultSet rs,Statement st,Connection conn){
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
