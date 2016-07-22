package cn.guoxinan._05;

public class Batter {
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void charge(){
		if(this.power<100)
		this.power=this.power+10;
		else System.out.println("----------电充满了哥哥");
	}
	public void use(){
		if(this.power>10)
		this.power-=10;
		else System.out.println("----------没电了哥哥，");
	}
	public Batter(){}
	public Batter(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	@Override
	public String toString() {
		return "Batter [name=" + name + ", power=" + power + "]";
	}
	
}
