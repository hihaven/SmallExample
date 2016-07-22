package cn.guoxinan._06Extends;

public class Rect extends Shape{
	private double r1;
	private double r2;
	
	public double getR1() {
		return r1;
	}
	public void setR1(double r1) {
		this.r1 = r1;
	}
	public double getR2() {
		return r2;
	}
	public void setR2(double r2) {
		this.r2 = r2;
	}
	public Rect(){this.setName("¾ØÐÎ");}
	public Rect(double r1,double r2){
		this();
		this.setR1(r1);
		this.setR2(r2);
		super.setC((this.getR1()+this.getR2())*2);
		super.setS(this.getR1()*this.getR2());
	}
	public void perimeter(){
//		super.setC((this.getR1()+this.getR2())*2);
//		super.perimeter();
	}
	public void area(){
//		super.setS(this.getR1()*this.getR2());
//		super.area();
	}
}
