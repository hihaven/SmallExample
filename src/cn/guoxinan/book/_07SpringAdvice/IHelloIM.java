package cn.guoxinan.book._07SpringAdvice;

public class IHelloIM implements IHello{

	@Override
	public void say(String name) {
		System.out.println("hello "+name);
	}

}
