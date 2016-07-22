package cn.itsource._02properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Test3 {
static	Properties p=new Properties();
static{
}
	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
		 p.setProperty("username", "haven");
		 p.put("pwd", "123");
		p.store(new FileOutputStream(new File("src/cn/itsource/_02properties/test3.properties")), null);
//		System.out.println(p.getProperty("username"));
	}

}
