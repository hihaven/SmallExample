package cn.itsource._03;

/**
 * 
 * @author heave
 *	����ģʽ ֮����ģʽ
 */
public class Singleton1 {
	

	private Singleton1(){}
	
	private static Singleton1 i=new Singleton1();
	public static Singleton1 getSingleton1(){
		return i;
	}
	public void getName(){
		System.out.println("--------���ֶ���");
	}
}
