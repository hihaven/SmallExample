package cn.guoxinan._03;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ti2();
		 ti3();

	}

	public static void ti2() {
		String str = null;
		String[] a = { "张三", "李四", "王五", "贺文", "李刚", "玉米", "苹果", "菠萝", "香蕉", "橘子" };

		for (int i = a.length - 1; i > 0; i--) {

			int ran = (int) (Math.random() * (i + 1));
			String[] b = new String[i];
			System.out.println("随机了踢走了" + a[ran]);
			for (int j = 0; j < b.length; j++) {
				if (j < ran)
					b[j] = a[j];
				else
					b[j] = a[j + 1];
			}
			a = b;
			for (int j = 0; j < b.length; j++) {
				// a[j] = b[j];
				System.out.print("\t" + b[j]);
			}
			System.out.println();
		}

	}

	public static void ti3() {
		Scanner sc = new Scanner(System.in);
		String userinfo[] = { "num ++birthday++score" };
		while (true) {
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("*		客户信息管理系统		*");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("1. 显 示 所 有 客 户 信 息");
			System.out.println("2. 添 加 客 户 信 息");
			System.out.println("3. 修 改 客 户 信 息");
			System.out.println("4. 查 询 客 户 信 息");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("请选择,输入数字或按0返回上一级菜单:");
			// int usernum=sc.nextInt();
			//
			// if(usernum==1){
			// xianshi(userinfo);
			// }else if(usernum==2){
			// userinfo=tianjia(userinfo);
			// }else if(usernum==3){
			// userinfo=xiugai(userinfo);
			// }else if(usernum==4){
			// chaxun(userinfo);
			// } 
			// else if(usernum==0)break;
			// }
			String user = sc.next();
			switch (user) {
			case "1":
				xianshi(userinfo);
				break;
			case "2":
				userinfo = tianjia(userinfo);
				break;
			case "3":
				userinfo = xiugai(userinfo);
				break;
			case "4":
				chaxun(userinfo);
			default:
				System.out.println("输入错误");
				break;
			}
		}
	}

	private static void chaxun(String[] userinfo) {
		// TODO Auto-generated method stub
		System.out.println("4. 查 询 客 户 信 息");
		System.out.println("please input you will call the index:");
		Scanner sc = new Scanner(System.in);
		int yourstr = sc.nextInt();
		System.out.println("the info:  " + userinfo[yourstr]);
		System.out.println("select has finished!");
	}

	private static String[] xiugai(String[] userinfo) {
		// TODO Auto-generated method stub
		System.out.println("3. 修 改 客 户 信 息");
		Scanner sc = new Scanner(System.in);
		System.out.println("input your index");
		int yourstr = sc.nextInt();
		System.out.println("your change --:" + userinfo[yourstr]);
		System.out.println("input your new userinfo--");
		String newinfo = sc.next();
		userinfo[yourstr] = newinfo;
		System.out.println("update the oldinfo to newuserinfo has success");
		return userinfo;
	}

	private static String[] tianjia(String[] userinfo) {
		// TODO Auto-generated method stub
		System.out.println("2. 添 加 客 户 信 息");
		System.out.println("请输入你的信息");
		String b[] = new String[userinfo.length + 1];
		Scanner sc = new Scanner(System.in);
		String yourstr = sc.next();
		for (int i = 0; i < b.length - 1; i++) {
			b[i] = userinfo[i];
		}
		b[b.length - 1] = yourstr;
		userinfo = b;
		System.out.println("tianjia   ----end");
		return userinfo;
	}

	private static void xianshi(String userinfo[]) {
		// TODO Auto-generated method stub
		System.out.println("1. 显 示 所 有 客 户 信 息");
		for (String i : userinfo) {
			System.out.println(i);
		}
	}
}
