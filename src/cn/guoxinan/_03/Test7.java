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

			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *\n" + "*		�ͻ���Ϣ����ϵͳ		*\n"
					+ "* * * * * * * * * * * * * * * * * * * * * * * * *\n" + "1. �� ʾ �� �� �� �� �� Ϣ\n"
					+ "2. �� �� �� �� �� Ϣ\n" + "3. �� �� �� �� �� Ϣ\n" + "4. �� ѯ �� �� �� Ϣ\n"
					+ "* * * * * * * * * * * * * * * * * * * * * * * * * \n");
			in = sc.nextInt();
			if (in == 1) {
				System.out.println("��ʾ��ʼ");
				for(int i=0;i<str.length;i++){
					System.out.println(i+":  "+str[i]);
				}
				System.out.println("��ʾ���");
			} else if (in == 2) {
				System.out.println("��ӿ�ʼ");
				for(int i=0;i<3;i++){
				String s=sc.next();
				str[i]=s;
				}
				System.out.println("������");
			} else if (in == 3) {
			} else if (in == 4) {
			}
		} while (in != 0);

		System.out.println("�˳�");

	}

	public static void ti_8() {
		double a = 100, sum = 0, b = 0, c = 0;
		for (int i = 0; i < 10; i++) {
			b = a / 2;
			sum = a + b;
			a = b;
			c = c + sum;

		}
		System.out.println("��ô����" + c + "��ô��" + b);
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
				System.out.println("��һ������" + i);
		}

	}

	public static void ti_6() {

	}

	public static void ti_4() {
		int a = 50, b = 15, c = 5, n = 0;
		while ((c * n + b) != 50) {
			n++;
		}
		System.out.println("Ҫ��ˮ��" + n + "��");
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

			System.out.println("22����" + ge);
			System.out.println("22һ��" + sum);
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
		System.out.println("����������ĺ��ǣ�" + sum);
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
			System.out.println("�����ĺͣ�" + sum);
		} else {
			System.out.println("ϵͳ�˳�");
		}

	}

	public static void ti_1() {
		System.out.println("������");
		int a, num;
		boolean tag = false;
		while (!tag) {
			num = 0;
			a = sc.nextInt();
			do {
				a = a / 10;
				num++;
			} while (a > 0);
			System.out.println("��������Ǽ�λ����" + num);
		}
	}

	public static void ti9Main() {
		int in = 0;
		final String a = "Java���������";
		final String b = "ʹ��HTML���Կ���վ��";
		final String c = "ʹ��SQL Server����Ͳ�ѯ����";
		do {
			System.out.println("��ӭ�����γ����ƺͿγ̴��ŵ�ת������������1-3������һ���������ض�Ӧ�Ŀγ�������0�˳�ϵͳ");
			in = sc.nextInt();
			if (in == 1) {
				System.out.println("��Ӧ����" + a);
			} else if (in == 2) {
				System.out.println("��Ӧ����" + b);
			} else if (in == 3) {
				System.out.println("��Ӧ����" + c);
			} else if (in > 3) {
				System.out.println("�Բ���û�ж�Ӧ�Ŀγ�");
			}
		} while (in != 0);
		System.out.println("-----------���Ѿ��ɹ��˳�ϵͳ");

	}

	public static void ti_6_main() {
		long yunxin = System.currentTimeMillis();
		System.out.println("----------------��ӭ����������");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������");
		int year = sc.nextInt();
		System.out.println("�����·�");
		int month = sc.nextInt();
		System.out.println("��������");
		int day = sc.nextInt();

		System.out.println("------���������" + year + "-" + month + "-" + day);
		System.out.println("��������ǲ��������أ�" + runOrPing(year));
		System.out.println("�����һ���Ѿ����˶������أ�" + bigOrsmallMonth(month, year, day));
		System.out.println("���������ݾ���1900.1.1�Ѿ���ȥ��" + (year - 1900) + "�깲��" + goDays(year) + "��");
		System.out.println("�������ʱ�����1900.1.1�Ѿ���ȥ��" + (year - 1900) + "�깲��"
				+ (goDays(year) + bigOrsmallMonth(month, year, day)) + "��");
		System.out.println("�����������������" + whatWeek(year, month, day));
		System.out.println("��������·ݵĵ�һ�������ڣ�" + whatWeek_2(year, month, day));

		System.out.println("������" + (System.currentTimeMillis() - yunxin) + "����");
		rili(year);
	}

	/**
	 * ���ظ����������
	 * 
	 * @param year
	 */
	public static void rili(int year) {
		System.out.println(year + "�������");
		for (int i = 1; i <= 12; i++) {

			System.out.println("|-------------------------��" + i + "��---------------------");
			System.out.println("  �� \t һ  \t ��  \t �� \t �� \t �� \t ��   ");
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
	 * ���ظ���������¸����������ڼ�
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
	 * ���ظ�������������µĵ�һ�������ڼ�
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
	 * ���ظ����굽1970����˶����죬
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
	 * ���ظ������ڸ����������
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
			System.out.println("��������");
			break;
		}
		return month;
	}

	/**
	 * ���ص�ǰ�꣬�Ѿ����˶�����
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
	 * �ж��ǲ�������
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
