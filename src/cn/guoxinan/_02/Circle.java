package cn.guoxinan._02;

public class Circle extends Shape{
	public float r;
	private final float PI=3.14f;
	public Circle(String name,float r){
		super(name);
		this.r=r;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

}
