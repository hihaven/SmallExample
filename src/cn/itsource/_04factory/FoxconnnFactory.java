package cn.itsource._04factory;

public class FoxconnnFactory {
	public static Phone getPhone(String str){
		if("ƻ��".equals(str)){
			return new Iphone();
		}
		else{
			System.out.println("������������");
			return null;
		}
	}
}
