package cn.guoxinan._06Extends;

public class Circle extends Shape{
	private final static double ¦Ð=3.14;
	private double r;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public static double get¦°() {
		return ¦Ð;
	}
	public Circle(){}
	public Circle(double r){
		super("Ô²ÐÎ");
		this.setR(r);
		super.setC(2*¦Ð*r);
		super.setS(¦Ð*r*r);
	}
	public void perimeter(){
//		super.setC(2*¦Ð*r);
//		super.perimeter();
	}
	public void area(){
//		super.setS(¦Ð*r*r);
//		super.area();
	}
	
}
