package cn.guoxinan._06Extends;

public class Persion {
	public String name;
	public String age;

	public void run() {
		System.out.println("父亲在跑步中");
	}

	public Persion() {
		System.out.println("父类的午餐苏");
	}

	public Persion(String name, String age) {
	}

	public static void main(String[] args) {
		Man man = new Man();
		man.run();
		man.eat();
		System.out.println(man.name);
		System.out.println(man.age);
	}
}

class Man extends Persion {
	public void eat() {
		System.out.println("wo zai 吃东西");
	}
	public void run(){
		super.run();
		System.out.println("儿子也在跑步了");
	}
public Man(){super();}
	public Man(String name, String age) {
		super(name, age);
	}
}
