package cn.guoxinan._03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("请输入年和月");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		ti_1(year, month);
		ti_2();
	}

	/**
	 * 求是不是闰年 求月份有几天
	 * 
	 * @param year
	 * @param month
	 */
	public static void ti_1(int year, int month) {
		boolean years = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			years = true;
		}
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
			if (years)
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

		System.out.println("你输入的是不是闰年:" + years);
		System.out.println("你输入的月份的天数:" + month);
	}

	/**
	 * 输出所有的水仙花数
	 */
	public static void ti_2() {
 		for (int a = 100; a <= 999; a++) {
			shuixian(a);
		}
	}

	public static boolean shuixian(int a) {
		int a1 = a / 100;
		int a2 = a % 100 / 10;
		int a3 = a % 10;
		// System.out.println(a1+""+a2+a3);
		if (a == Math.pow(a1, 3) + Math.pow(a2, 3) + Math.pow(a3, 3)) {
			System.out.println(a);
			return true;
		} else
			return false;
	}
}
