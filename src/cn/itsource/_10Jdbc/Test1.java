package cn.itsource._10Jdbc;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class Test1 {
	static Properties p=new Properties();
	static{
		try {
			p.load(Test1.class.getClassLoader().getResourceAsStream("cn/itsource/_10Jdbc/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception{
		
		Class cla=Class.forName(p.getProperty("jdbcClass"));
		JdbcCon j = (JdbcCon) cla.newInstance();
		
		Method getcon = cla.getDeclaredMethod("getcon");
		getcon.setAccessible(true);
		Connection con = (Connection) getcon.invoke(j);
		java.sql.Statement sta = con.createStatement();
		String sql="select * from student";
		ResultSet set = sta.executeQuery(sql);
		while(set.next()){
			System.out.println(set.getString(1)+set.getString(2)+set.getString(3));
		}
		Method close=cla.getDeclaredMethod("close",ResultSet.class,Statement.class,Connection.class);
		close.invoke(j,set,sta,con);
	}
}
