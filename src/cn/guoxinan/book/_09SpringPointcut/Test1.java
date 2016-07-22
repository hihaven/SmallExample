package cn.guoxinan.book._09SpringPointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("src/cn/guoxinan/book/_09SpringPointcut/applicationContext.xml");
		Human human = (Human) context.getBean("helloProxy");
		human.showname("123456");
		human.showcar("12");
	}

}
