package cn.guoxinan.book._05Spring;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在指定的路中找到文件，
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/applicationContext.xml");
		//在类路径中招到文件
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Human c=(Human)ctx.getBean("american");
		c.eat();
		Human c1=(Human)ctx.getBean("chinese");
		c1.eat();
		helloSpeaker h=new helloSpeaker();
		h.hello("haven");
	}

}
class helloSpeaker{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	public void hello(String name){
		logger.log(Level.INFO, "hello method starts");
		System.out.println("hello"+name);
		logger.log(Level.INFO, "hello method ends");
	}
}