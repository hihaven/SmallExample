package cn.guoxinan._04;

/*
 * ��Ʒ�࣬ʹ�þ�̬��ʼ����ʵ�ֵ���
 */

public class Present {
	public String name;
	public int price;
	private static Present present=null;
	static{
		present=new Present();
	}
	private Present(){
		System.out.println("�����˹��췽��");
	}
	public static Present getinstance(){
		return present;
	}
	public String toString(){
		return "[ "+this.name+"  "+this.price+"]";
	}
}
