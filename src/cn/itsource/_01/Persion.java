package cn.itsource._01;

public class Persion {
	private String name;
	private int age;

	public Persion() {

	}

	private  Persion(String name) {
		
		this.name = name;
	}

	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String setName(String name){
		this.name=name;
		System.out.println(name);
		return name;
	}
	private void prisetName(String name){
		System.out.println(name);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
