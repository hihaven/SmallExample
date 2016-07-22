package cn.itsource._03;

public enum Singleton4 {
	INSTANCE;
	private Singleton4(){
		
	}
	public void getName(){
		System.out.println("--------保持队形--这是枚举单例");
	}
}
