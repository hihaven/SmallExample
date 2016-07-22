package cn.guoxinan._06Extends;

public class Car extends JiaoTongTool {
	private String name;
	private String color;
	private String zuo;
	public Car(){
		
	}
	public Car(String name,String color,String zuo){
		super(name,color,zuo);
	}
	public static void main(String []args){
		Car car=new Car("this","red","5zuo");
		System.out.println(car);
	}
}
