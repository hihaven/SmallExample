package cn.guoxinan._06Extends;

public class Persion {
	public String name;
	public String age;

	public void run() {
		System.out.println("�������ܲ���");
	}

	public Persion() {
		System.out.println("����������");
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
		System.out.println("wo zai �Զ���");
	}
	public void run(){
		super.run();
		System.out.println("����Ҳ���ܲ���");
	}
public Man(){super();}
	public Man(String name, String age) {
		super(name, age);
	}
}
