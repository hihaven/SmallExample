package cn.guoxinan._07ExtendsPolymorphic;

public class Test1 {
	public static void main(String []args) throws InstantiationException, IllegalAccessException{
		//向上转型
		Shape sr=new Circle();
		sr.show();
		//向下转型
//		Circle cr= (Circle) new Shape();
//		if(sr instanceof Circle){
//			System.out.println("yes");
//		}else System.out.println("no");
		//向下转型
		Circle b=(Circle)sr;
		sr.show();
	
	}
}
class Circle extends Shape{
	public String name="12";
	public void  showinfo(){
		System.out.println("子类方法");
	}
	public void show(){
		System.out.println("子类重写");
	}
}

class Shape{
	public void show(){
		System.out.println("父类的方法");
	}
}