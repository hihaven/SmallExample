package cn.itsource._02properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) throws IOException {
		/**
		 * 
		 */
//		Properties p = new Properties();
//		File f=new File("src/cn/itsource/_02properties/jdbc.properties");
//		InputStream istream = new FileInputStream(f);
//		p.load(istream);
//		String username = p.getProperty("username");
//		String pwd = p.getProperty("password");
//		System.out.println(username);
//		System.out.println(pwd);
		
		/**
		 * 通过类加载器 
		 */
//		 Properties p=new Properties();
//		 ClassLoader loader = Test1.class.getClassLoader();
//		 //p.load(Test1.class.getClassLoader().getResourceAsStream("cn/itsource/_02properties/Test1.java"));
//		 InputStream inStream = loader.getResourceAsStream("cn/itsource/_02properties/jdbc.properties");
//		 p.load(inStream);
//		 String username=p.getProperty("username");
//		 System.out.println(username);



				/**
				 * 线程来获得
				 */
		Properties p=new Properties();
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("cn/itsource/_02properties/jdbc.properties"));
		System.out.println(p.getProperty("username"));
		/**
		 * 类获得
		 */
		p.load(Test1.class.getClassLoader().getResourceAsStream("cn/itsource/_02properties/jdbc.properties"));
		System.out.println(p.getProperty("password"));
		/**
		 * 
		 */
		
			p.load(new FileInputStream("src/cn/itsource/_02properties/jdbc.properties"));
			System.out.println(p.getProperty("username"));
	}
	

}
