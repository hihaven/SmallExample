package cn.guoxinan.book._05Spring;

public class American implements Human{
	public void init(){
		System.out.println("�Ѿ��������˰� ");
	}
	public void close(){
		System.out.println("�Ѿ����ع������Ҷ��Ѿ���ɾ����");
	}
	public void say(){
		System.out.println(" i am american");
	}

	@Override
	public void eat() {
		System.out.println(" i am american");
	}

	@Override
	public void walk() {
		System.out.println(" i am american");
	}
}
