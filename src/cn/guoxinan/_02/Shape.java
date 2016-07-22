package cn.guoxinan._02;

public abstract class Shape {
	public abstract double calcArea();
	public Shape(){}
	public Shape(String name){
		System.out.println(name+"shape createed");
	}
	public String toStrng(){
		return "this is shape";
	}
}
