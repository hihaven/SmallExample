package cn.guoxinan.book._05Spring;

public class American implements Human{
	public void init(){
		System.out.println("已经被加载了哎 ");
	}
	public void close(){
		System.out.println("已经加载过了吗，我都已经被删除了");
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
