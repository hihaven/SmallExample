package cn.guoxinan._05;

public class Test2 {
	public static void main(String[] args) {
		
		Phone phone = new Phone("贺文的手机");
		System.out.println(phone);
		// 充电一次
		phone.addPower();
		System.out.println(phone);
		// 放歌 小幸运
		phone.getMusic("小幸运");
		System.out.println(phone);
		// 下载歌曲
		phone.addMusic("丑八怪");
		System.out.println(phone);
		// 放歌 小幸运
		phone.getMusic("小幸运");
		System.out.println(phone);
		// 放歌 小幸运
		phone.getMusic("小幸运");
		System.out.println(phone);
		// 放歌 小幸运
		phone.getMusic("小幸运");
		System.out.println(phone);

	}
}
