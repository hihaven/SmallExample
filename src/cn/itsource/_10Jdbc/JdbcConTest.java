package cn.itsource._10Jdbc;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JdbcConTest {
	static Properties p=p=new Properties();
	static{
		try {
			p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("cn/itsource/_10Jdbc/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("zai zhe befor");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJdbcCon() {
		
	}

	@Test
	public void testGetInstance() {
		
	}

	@Test
	public void testGetcon() {
		try {
			Class cla=Class.forName(p.getProperty("jdbcClass"));
			JdbcCon jdbccon = (JdbcCon) cla.newInstance();
			
			Method m1 = cla.getDeclaredMethod("getcon");
			Object invoke = m1.invoke(jdbccon);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testClose() {
		
	}

}
