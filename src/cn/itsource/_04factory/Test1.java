package cn.itsource._04factory;

public class Test1 {
	public static void main(String[] args){
	Phone p=FoxconnnFactory.getPhone("ƻ��");
	p.call();
	System.out.println(p.getClass());
	
	}
}
