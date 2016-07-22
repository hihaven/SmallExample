package cn.guoxinan._04;

/*
 * 礼品类，使用静态初始化快实现单例
 */

public class Present {
	public String name;
	public int price;
	private static Present present=null;
	static{
		present=new Present();
	}
	private Present(){
		System.out.println("调用了构造方法");
	}
	public static Present getinstance(){
		return present;
	}
	public String toString(){
		return "[ "+this.name+"  "+this.price+"]";
	}
}
