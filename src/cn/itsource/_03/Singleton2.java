package cn.itsource._03;

/**
 * 
 * @author heave
 *单例模式之懒汉模式而且是线程安全的
 */
public class Singleton2 {
	private Singleton2(){}
	private static Singleton2 instance;
	public static synchronized Singleton2 get(){
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}
	public void getName(){
		System.out.println("--------保持队形");
	}
}
