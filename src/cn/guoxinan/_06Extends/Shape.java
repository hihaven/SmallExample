package cn.guoxinan._06Extends;

public class Shape {
	private double c;
	private double s;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public Shape(){}
	public Shape(String name){this.setName(name);}
	public void perimeter(){
//		System.out.println(this.getName()+"周长为"+this.getC());
	}
	public void area(){
		
//		System.out.println(this.getName()+"面积为"+this.getS());
	}
	@Override
	public String toString() {
		return "Shape [c=" + c + ", s=" + s + ", name=" + name + "]";
	}
}
