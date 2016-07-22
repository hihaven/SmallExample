package cn.guoxinan.book._06SpringAOP;

public class HelloSpeaker implements IHello{

	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello::"+name);
	}
	
}
