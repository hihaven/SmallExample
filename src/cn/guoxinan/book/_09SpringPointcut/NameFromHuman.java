package cn.guoxinan.book._09SpringPointcut;

public class NameFromHuman implements Human{

	@Override
	public void showname(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello ,my name is " +name);
	}

	@Override
	public void showcar(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello , my car is BMW");
	}

}
