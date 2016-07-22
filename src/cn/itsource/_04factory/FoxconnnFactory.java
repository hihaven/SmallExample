package cn.itsource._04factory;

public class FoxconnnFactory {
	public static Phone getPhone(String str){
		if("苹果".equals(str)){
			return new Iphone();
		}
		else{
			System.out.println("有人来渣场次");
			return null;
		}
	}
}
