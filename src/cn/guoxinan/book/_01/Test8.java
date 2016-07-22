package cn.guoxinan.book._01;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;

public class Test8 {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, Exception, Exception {
		// TODO Auto-generated method stub
		System.out.println(Class.forName("java.util.Date").newInstance());
		System.out.println(Class.forName("cn.guoxinan.book._01.Test7").newInstance());
		Test7 t = (Test7) Class.forName("cn.guoxinan.book._01.Test7").newInstance();
		t.toString();
		Class cla1 = Class.forName("cn.guoxinan.book._01.Test7");
		Test7 t7 = (Test7) cla1.newInstance();
		Method m1 = cla1.getDeclaredMethod("testone", String.class);
		m1.invoke(t7, "这是我的");
		Method m2 = cla1.getDeclaredMethod("testtow");
		m2.setAccessible(true);
		m2.invoke(t7);
		
		
		Class cla = Date.class;// Class cla=Class.forName("java.util.Date") Date
								// d=new Date(); d.getClass();
		Constructor constructor = cla.getConstructor(long.class);
		Date instance = (Date) constructor.newInstance(123456789000L);
		System.out.println(instance);
		
		getFileid();
	}
	public static void getFileid() throws Exception{
		Class cl=Class.forName("cn.guoxinan.book._01.Test7");
		Test7 t7 = (Test7)cl.newInstance();
		Field a1 = cl.getDeclaredField("a");
		a1.setAccessible(true);
		String a1Text = (String) a1.get(t7);
		System.out.println("++++"+a1Text);
	}

}
