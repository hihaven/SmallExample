package cn.itsource._03;

/**
 * 
 * @author heave
 *����ģʽ֮ʹ�þ�̬�������ɣ�ǿ���Ƽ��ģ�
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
		System.out.println("--------���ֶ���");
	}
}
