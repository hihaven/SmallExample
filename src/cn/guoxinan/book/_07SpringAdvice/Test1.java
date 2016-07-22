package cn.guoxinan.book._07SpringAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
	public static void main(String[] args){
		ApplicationContext con=new FileSystemXmlApplicationContext("src/cn/guoxinan/book/_07SpringAdvice/applicationContext.xml");
		IHello bean = (IHello) con.getBean("helloProxy");
		bean.say("123456789");
	}
}