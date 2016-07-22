package cn.itsource._04factory;

public class Test1 {
	public static void main(String[] args){
	Phone p=FoxconnnFactory.getPhone("Æ»¹û");
	p.call();
	System.out.println(p.getClass());
	
	}
}
