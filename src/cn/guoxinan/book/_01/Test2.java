package cn.guoxinan.book._01;

public class Test2<T extends Persion> {
	private T t;

	public void sy() {
		t.say();
	}

	public Test2(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		Test2<Student> t1 = new Test2<Student>(new Student());
		t1.sy(); 
		Test2<Persion> t2 = new Test2<Persion>(new Persion());
		t2.sy();
	}

}

class Persion {

	public void say() {
		System.out.println("persion");
	}
}

class Student extends Persion {

	public void say() {
		System.out.println("Student");
	}
}

class Teacher extends Persion {
	public void say() {
		System.out.println("teacher");
	}
}