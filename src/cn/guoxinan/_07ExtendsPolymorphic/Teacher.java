package cn.guoxinan._07ExtendsPolymorphic;

public class Teacher {
	public static void main(String[] args){
		D d=new D();
		B b=new B("b","b");
		C c=new C("c","c");
		d.show(b);
		d.show(c);
	}
}
class A{
	public String name;
	public String className;
	public A(){}
	public A(String name,String className){this.name=name;this.className=className;}
	public void getname(){}
	public void getclass(){}
}
class B extends A{
	public B(){
		
	}public B(String name,String className){super(name,className);}
}
class C extends A{
public C(){
		
	}public C(String name,String className){super(name,className);}
}
class D{
	public void show(A a){
		System.out.println(a.name+"----"+a.className);
	}
}