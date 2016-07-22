package cn.itsource._03;

/**
 * 
 * @author heave
 *单例模式之使用静态代码块完成（强烈推荐的）
 */
public class Singleton3 {
	private Singleton3(){}
	private  static Singleton3 instance;
	static{
		instance=new Singleton3();
	}
	public static Singleton3 get(){
		return instance;
	}
	public void getName(){
		System.out.println("--------保持队形");
	}
}
