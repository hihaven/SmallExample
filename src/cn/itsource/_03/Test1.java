package cn.itsource._03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test1 {
	public static void main(String []args) {
		Singleton1 s1=Singleton1.getSingleton1();
		s1.getName();
		Singleton2 s2=Singleton2.get();
		s2.getName();
		Singleton3 s3=Singleton3.get();
		s3.getName();
		Singleton4.INSTANCE.getName();
	}
}
