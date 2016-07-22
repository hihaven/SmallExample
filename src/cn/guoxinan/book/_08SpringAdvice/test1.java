package cn.guoxinan.book._08SpringAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test1 {
	public static void main(String[] args){
		ApplicationContext con=new FileSystemXmlApplicationContext("src/cn/guoxinan/book/_08SpringAdvice/applicationContext.xml");
		IHello hello = (IHello)con.getBean("helloProxy");
		hello.hello("haven");
	}
}
