package cn.guoxinan._07ExtendsPolymorphic;

public class Test1 {
	public static void main(String []args) throws InstantiationException, IllegalAccessException{
		//����ת��
		Shape sr=new Circle();
		sr.show();
		//����ת��
//		Circle cr= (Circle) new Shape();
//		if(sr instanceof Circle){
//			System.out.println("yes");
//		}else System.out.println("no");
		//����ת��
		Circle b=(Circle)sr;
		sr.show();
	
	}
}
class Circle extends Shape{
	public String name="12";
	public void  showinfo(){
		System.out.println("���෽��");
	}
	public void show(){
		System.out.println("������д");
	}
}

class Shape{
	public void show(){
		System.out.println("����ķ���");
	}
}