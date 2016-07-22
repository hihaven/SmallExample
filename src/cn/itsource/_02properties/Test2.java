package cn.itsource._02properties;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		File f=new File("cn.itsource._02properties.jdbc.properties");
		ClassLoader loader =Thread.currentThread().getContextClassLoader();
		try {
			p.load(loader.getResourceAsStream("cn/itsource/_02properties/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String s=p.getProperty("username");
		 System.out.println(s);
	}

}
