package cn.guoxinan._03;

import java.util.Scanner;

public class Test7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ti_6_main();
		// ti9Main();
		// ti_1();
		// ti_2();
		// ti_3();
		// ti_2_1();
		// ti_4();
		// ti_5();
		// ti_6();
		// ti_7();
		// ti_8();
		ti_11();
	}

	public static void ti_11() {
		int in = 0,a=0;
		String str[]=new String[4];
		do {

			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *\n" + "*		客户信息管理系统		*\n"
					+ "* * * * * * * * * * * * * * * * * * * * * * * * *\n" + "1. 显 示 所 有 客 户 信 息\n"
					+ "2. 添 加 客 户 信 息\n" + "3. 修 改 客 户 信 息\n" + "4. 查 询 客 户 信 息\n"
					+ "* * * * * * * * * * * * * * * * * * * * * * * * * \n");
			in = sc.nextInt();
			if (in == 1) {
				System.out.println("显示开始");
				for(int i=0;i<str.length;i++){
					System.out.println(i+":  "+str[i]);
				}
				System.out.println("显示完成");
			} else if (in == 2) {
				System.out.println("添加开始");
				for(int i=0;i<3;i++){
				String s=sc.next();
				str[i]=s;
				}
				System.out.println("添加完成");
			} else if (in == 3) {
			} else if (in == 4) {
			}
		} while (in != 0);

		System.out.println("退出");

	}

	public static void ti_8() {
		double a = 100, sum = 0, b = 0, c = 0;
		for (int i = 0; i < 10; i++) {
			b = a / 2;
			sum = a + b;
			a = b;
			c = c + sum;

		}
		System.out.println("这么多米" + c + "这么高" + b);
	}

	public static void ti_7() {
		boolean f;
		for (int i = 101; i <= 200; i++) {
			f = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					f = false;
				}
			}
			if (f)
				System.out.println("是一个素数" + i);
		}

	}

	public static void ti_6() {

	}

	public static void ti_4() {
		int a = 50, b = 15, c = 5, n = 0;
		while ((c * n + b) != 50) {
			n++;
		}
		System.out.println("要挑水：" + n + "次");
	}

	public static void ti_5() {
		int in = 0, sum = 0, ge = 0;

		bs: do {

			System.out.println("qing input:");
			in = sc.nextInt();
			if (in == 999) {
				continue bs;
			} else if (in >= 22) {
				ge++;
			} else if (in < 22) {
				sum++;
			}

			System.out.println("22以上" + ge);
			System.out.println("22一下" + sum);
		} while (in != 999);

	}

	public static void ti_3() {
		for (int i = 65; i < 70; i++) {
			for (int j = 65; j <= i; j++) {

				System.out.print((char) j);
			}
			System.out.println();
		}

		for (int i = 65; i < 70; i++) {
			for (int j = 65; j <= i; j++) {

				System.out.print((char) i);
			}
			System.out.println();
		}
	}

	public static void ti_2_1() {
		int in = 0, sum = 0, ge = 0;

		bs: do {
			for (int i = 0; i < 10; i++) {
				System.out.println("qing input:");
				in = sc.nextInt();
				if (in == 999) {
					continue bs;
				} else if (in > 0) {
					ge++;
					sum = sum + in;
				}
			}
		} while (in != 999);
		System.out.println("你输入的数的和是：" + sum);
	}

	public static void ti_2() {
		int a = 0, sum = 0;
		boolean f = true;
		int[] b = new int[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			if (b[i] == 999) {
				f = false;
				break;
			}
		}
		if (f) {
			for (int i = 0; i < b.length; i++) {
				if (b[i] > 0) {
					sum = sum + b[i];
				}
			}
			System.out.println("正数的和：" + sum);
		} else {
			System.out.println("系统退出");
		}

	}

	public static void ti_1() {
		System.out.println("请输入");
		int a, num;
		boolean tag = false;
		while (!tag) {
			num = 0;
			a = sc.nextInt();
			do {
				a = a / 10;
				num++;
			} while (a > 0);
			System.out.println("你输入的是几位数：" + num);
		}
	}

	public static void ti9Main() {
		int in = 0;
		final String a = "Java面向对象编程";
		final String b = "使用HTML语言开发站点";
		final String c = "使用SQL Server管理和查询数据";
		do {
			System.out.println("欢迎来到课程名称和课程代号的转换器，请输入1-3中任意一个数将返回对应的课程名输入0退出系统");
			in = sc.nextInt();
			if (in == 1) {
				System.out.println("对应的是" + a);
			} else if (in == 2) {
				System.out.println("对应的是" + b);
			} else if (in == 3) {
				System.out.println("对应的是" + c);
			} else if (in > 3) {
				System.out.println("对不起，没有对应的课程");
			}
		} while (in != 0);
		System.out.println("-----------你已经成功退出系统");

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

		System.out.println("运行了" + (System.currentTimeMillis() - yunxin) + "毫秒");
		rili(year);
	}

	/**
	 * 返回给定年的日历
	 * 
	 * @param year
	 */
	public static void rili(int year) {
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
	 * 
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
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static int whatWeek_2(int year, int month, int day) {
		return (goDays(year) + days_1(month, year) + 1) % 7;
	}

	/**
	 * 返回给定年到1970年过了多少天，
	 * 
	 * @param year
	 * @return
	 */
	public static int goDays(int year) {
		int days = 365 * (year - 1900), num = 0;
		for (int i = 1900; i < year; i++) {
			if (runOrPing(i) == true) {
				num++;
			}
		}
		return days + num;
	}

	/**
	 * 返回给定月在给定年的天数
	 * 
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
	 * 
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

	public static int days_1(int month, int year) {
		int months = 0;
		for (int i = 1; i < month; i++) {
			months = months + thisMonth(i, year);
		}

		return months;
	}

	/**
	 * 判断是不是闰年
	 * 
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
