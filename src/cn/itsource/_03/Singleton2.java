package cn.itsource._03;

/**
 * 
 * @author heave
 *����ģʽ֮����ģʽ�������̰߳�ȫ��
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
		System.out.println("--------���ֶ���");
	}
}
