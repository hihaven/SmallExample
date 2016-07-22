package cn.guoxinan._03;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// ti_1_1();
		// ti_2();
//		ti_4();
//		 ti_5();
		 ti_6_main();
	}

	public static void ti_1_1() {
		int a = 32932972;
		int num = 0;
		String strNum = "";
		while (a > 0) {
			num = a % 10;
			a /= 10;
			System.out.println(num + "" + a);
			switch (num) {
			case 0:
				strNum = '零' + strNum;
				break;
			case 1:
				strNum = '壹' + strNum;
				break;
			case 2:
				strNum = '贰' + strNum;
				break;
			case 3:
				strNum = '叁' + strNum;
				break;
			case 4:
				strNum = '肆' + strNum;
				break;
			case 5:
				strNum = '伍' + strNum;
				break;
			case 6:
				strNum = '陆' + strNum;
				break;
			case 7:
				strNum = '柒' + strNum;
				break;
			case 8:
				strNum = '扒' + strNum;
				break;
			case 9:
				strNum = '揪' + strNum;
				break;
			}
		}
		System.out.println(strNum);
	}

	public static void ti_1() {
		int a = 32932792;
		String b = Integer.toString(a);
		char[] c = b.toCharArray();
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case '0':
				c[i] = '零';
				break;
			case '1':
				c[i] = '壹';
				break;
			case '2':
				c[i] = '贰';
				break;
			case '3':
				c[i] = '叁';
				break;
			case '4':
				c[i] = '肆';
				break;
			case '5':
				c[i] = '伍';
				break;
			case '6':
				c[i] = '陆';
				break;
			case '7':
				c[i] = '柒';
				break;
			case '8':
				c[i] = '扒';
				break;
			case '9':
				c[i] = '揪';
				break;
			}
		}
		String d = String.valueOf(c);
		System.out.println("a=" + d);

	}

	public static void ti_2() {
		for (int i = 0; i < 10000; i++) {
			if (i >= 0 && i < 10) {
				System.out.println(i);
			} else if (i < 100) {
				int a1 = i / 10;
				int a2 = i % 10;
				System.out.println(i + "=" + a1 + "+" + a2 + "=" + (a1 + a2));
			} else if (i < 1000) {
				int a1 = i / 100;
				int a2 = i % 100 / 10;
				int a3 = i % 10;
				System.out.println(i + "=" + a1 + "+" + a2 + "+" + a3 + "=" + (a1 + a2 + a3));
			} else if (i < 10000) {
				int a0 = i / 1000;
				int a1 = i % 1000 / 100;
				int a2 = i % 100 / 10;
				int a3 = i % 10;
				System.out.println(i + "=" + a0 + "+" + a1 + "+" + a2 + "+" + a3 + "=" + (a0 + a1 + a2 + a3));
			}
		}
	}

	public static void ti_3() {
		// i = 2 j =9
	}

	public static void ti_4() {
		Scanner sc = new Scanner(System.in);
		int flo = 0;
		String yesOrNo = "愿意";
		// while(yesOrNo==0){
		// flower++;
		// if(flower==10){
		// yesOrNo=1;
		// }
		// }
		String marryMe = sc.next();
		yesOrNo=sc.next();
		
		if (yesOrNo.equals("不愿意")) {
			do {

				System.out.println("不愿意，你要每天送我花，每天准时接送上下班，我才考虑");
				System.out.println("没关系，，我是土豪，我给你送花");

				int flower = sc.nextInt();
				if (flower == 1)
					flo++;
				System.out.println("我送了" + flo + "花给你了,你愿不愿意\n");
				if (flo >= 5) {
					yesOrNo = "愿意";
					System.out.println("我愿意");
				} else {
					System.out.println("还不够，我  不  愿    意 ！");
				}
			} while (yesOrNo.equals("不愿意"));
		}
		System.out.println("我们结婚吧");

	}

	public static void ti_5() {
		final String uname = "haven";
		final String pwd = "123456";
		boolean tag = false;

		Scanner sc = new Scanner(System.in);

		for (int n = 0; n < 4; n++) {
			System.out.println("请输入用户名：");
			String username = sc.next();
			System.out.println("请输入密码：");
			String password = sc.next();
			if (username.equals(uname) && password.equals(pwd)) {
				tag = true;
				break;
			} else {
				System.out.println("用户名或者密码错误");
			}
			if (n == 2) {
				System.out.println("你的输入次数已经超过三次现在已经退出系统");
				break;
			} else {
				System.out.println("请重新输入");
			}
		}
		if (tag == true) {
			System.out.println("---------------");
			System.out.println("--你已经成功登陆");
			System.out.println("--欢迎来到xxx管理系统");
			System.out.println("---------------");
		}
	}

	public static void ti_6_main() {
		long yunxin = System.currentTimeMillis();
		System.out.println("----------------欢迎来到万年历");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年份");
		int year = sc.nextInt();
		System.out.println("输入月份");
		int month = sc.nextInt();
		System.out.println("输入日期");
		int day = sc.nextInt();

		System.out.println("------你输入的是" + year + "-" + month + "-" + day);
		System.out.println("你输入的是不是闰年呢：" + runOrPing(year));
		System.out.println("你的这一年已经过了多少天呢：" + bigOrsmallMonth(month, year, day));
		System.out.println("你输入的年份距离1900.1.1已经过去了" + (year - 1900) + "年共计" + goDays(year) + "天");
		System.out.println("你输入的时间距离1900.1.1已经过去了" + (year - 1900) + "年共计"
				+ (goDays(year) + bigOrsmallMonth(month, year, day)) + "天");
		System.out.println("你输入的日期是星期" + whatWeek(year, month, day));
		System.out.println("你输入的月份的第一天是星期：" + whatWeek_2(year, month, day));

		System.out.println("运行了" + (System.currentTimeMillis() - yunxin)+"毫秒");
		rili(year);
	}
	/**
	 * 返回给定年的日历
	 * @param year
	 */
	public static void rili(int year){
		System.out.println(year + "年的日历");
		for (int i = 1; i <= 12; i++) {

			System.out.println("|-------------------------第" + i + "月---------------------");
			System.out.println("  日 \t 一  \t 二  \t 三 \t 四 \t 五 \t 六   ");
			for (int j = 1; j <= thisMonth(i, year); j++) {
				if (j == 1) {
					for (int c = 0; c < whatWeek_2(year, i, j); c++)
						System.out.print("  \t");
					System.out.print(" " + j + " \t");
				} else
					System.out.print(" " + j + " \t");
				if (whatWeek(year, i, j) == 6) {
					System.out.print("|");
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("|---------------------------------------------------");
		}
	}
/**
 * 返回给定年给定月给定日是星期几
 * @param year
 * @param month
 * @param day
 * @return
 */
	public static int whatWeek(int year, int month, int day) {
		int days = goDays(year) + bigOrsmallMonth(month, year, day);
		int week = days % 7;
		return week;
	}
/**
 * 返回给定给定年给定月的第一天是星期几
 * @param year
 * @param month
 * @param day
 * @return
 */
	public static int whatWeek_2(int year, int month, int day) {
		return (goDays(year) + days_1(month, year)+1) % 7;
	}
/**
 * 返回给定年到1970年过了多少天，
 * @param year
 * @return
 */
	public static int goDays(int year) {
		int days = 365 * (year - 1900), num = 0;
		for (int i = 1900; i < year; i++) {
			if (runOrPing(i)==true) {
				num++;
			}
		}
		return days + num;
	}
/**
 * 返回给定月在给定年的天数
 * @param month
 * @param year
 * @return
 */
	private static int thisMonth(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			month = 31;
			break;
		case 2:
			if (runOrPing(year))
				month = 29;
			else
				month = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			month = 30;
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		return month;
	}
/**
 * 返回当前年，已经过了多少天
 * @param month
 * @param year
 * @param day
 * @return
 */
	private static int bigOrsmallMonth(int month, int year, int day) {
		int months = 0;
		for (int i = 1; i < month; i++) {
			months = months + thisMonth(i, year);
		}

		return months + day;
	}

	public static int days_1(int month,int year){
		int months = 0;
		for (int i = 1; i < month; i++) {
			months = months + thisMonth(i, year);
		}

		return months;
	}
	/**
	 * 判断是不是闰年
	 * @param year
	 * @return
	 */
	public static boolean runOrPing(int year) {
		boolean years = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			years = true;
		}
		return years;

	}
}
