package cn.guoxinan._06Extends;

public class Circle extends Shape{
	private final static double ��=3.14;
	private double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public static double get��() {
		return ��;
	}
	public Circle(){}
	public Circle(double r){
		super("Բ��");
		this.setR(r);
		super.setC(2*��*r);
		super.setS(��*r*r);
	}
	public void perimeter(){
//		super.setC(2*��*r);
//		super.perimeter();
	}
	public void area(){
//		super.setS(��*r*r);
//		super.area();
	}
	
}
