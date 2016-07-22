package cn.guoxinan._02;

public class Rectangle extends Shape{
	private float width;
	private float height;
	public Rectangle(String name,float width,float height){
		super(name);
		this.height=height;
		this.width=width;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	public static void main(String[] args){
		Shape s1=new Circle("Ô²ÐÎ",32.5f);
		Shape s2=new Rectangle("¾ØÐÎ",3,5);
		System.out.println(s1.calcArea());
		System.out.println(s2.calcArea());
	}

}
