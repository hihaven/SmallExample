package cn.itsource._03;

/**
 * 
 * @author heave
 *	单例模式 之饿汉模式
 */
public class Singleton1 {
	

	private Singleton1(){}
	
	private static Singleton1 i=new Singleton1();
	public static Singleton1 getSingleton1(){
		return i;
	}
	public void getName(){
		System.out.println("--------保持队形");
	}
}
