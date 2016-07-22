package cn.guoxinan._06Extends;

public class Test2 {
	public static void main(String[] args){
		Rect r=new Rect(4,5);
		Circle c=new Circle(2);
		Square s=new Square(5);
		
		Shape []a={r,c,s};
		for(Shape i:a){
//			i.area();
//			i.perimeter();
			System.out.println(i);
		}
	}
}
