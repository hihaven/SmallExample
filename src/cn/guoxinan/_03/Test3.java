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
				strNum = '��' + strNum;
				break;
			case 1:
				strNum = 'Ҽ' + strNum;
				break;
			case 2:
				strNum = '��' + strNum;
				break;
			case 3:
				strNum = '��' + strNum;
				break;
			case 4:
				strNum = '��' + strNum;
				break;
			case 5:
				strNum = '��' + strNum;
				break;
			case 6:
				strNum = '½' + strNum;
				break;
			case 7:
				strNum = '��' + strNum;
				break;
			case 8:
				strNum = '��' + strNum;
				break;
			case 9:
				strNum = '��' + strNum;
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
				c[i] = '��';
				break;
			case '1':
				c[i] = 'Ҽ';
				break;
			case '2':
				c[i] = '��';
				break;
			case '3':
				c[i] = '��';
				break;
			case '4':
				c[i] = '��';
				break;
			case '5':
				c[i] = '��';
				break;
			case '6':
				c[i] = '½';
				break;
			case '7':
				c[i] = '��';
				break;
			case '8':
				c[i] = '��';
				break;
			case '9':
				c[i] = '��';
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
		String yesOrNo = "Ը��";
		// while(yesOrNo==0){
		// flower++;
		// if(flower==10){
		// yesOrNo=1;
		// }
		// }
		String marryMe = sc.next();
		yesOrNo=sc.next();
		
		if (yesOrNo.equals("��Ը��")) {
			do {

				System.out.println("��Ը�⣬��Ҫÿ�����һ���ÿ��׼ʱ�������°࣬�Ҳſ���");
				System.out.println("û��ϵ���������������Ҹ����ͻ�");

				int flower = sc.nextInt();
				if (flower == 1)
					flo++;
				System.out.println("������" + flo + "��������,��Ը��Ը��\n");
				if (flo >= 5) {
					yesOrNo = "Ը��";
					System.out.println("��Ը��");
				} else {
					System.out.println("����������  ��  Ը    �� ��");
				}
			} while (yesOrNo.equals("��Ը��"));
		}
		System.out.println("���ǽ���");

	}

	public static void ti_5() {
		final String uname = "haven";
		final String pwd = "123456";
		boolean tag = false;

		Scanner sc = new Scanner(System.in);

		for (int n = 0; n < 4; n++) {
			System.out.println("�������û�����");
			String username = sc.next();
			System.out.println("���������룺");
			String password = sc.next();
			if (username.equals(uname) && password.equals(pwd)) {
				tag = true;
				break;
			} else {
				System.out.println("�û��������������");
			}
			if (n == 2) {
				System.out.println("�����������Ѿ��������������Ѿ��˳�ϵͳ");
				break;
			} else {
				System.out.println("����������");
			}
		}
		if (tag == true) {
			System.out.println("---------------");
			System.out.println("--���Ѿ��ɹ���½");
			System.out.println("--��ӭ����xxx����ϵͳ");
			System.out.println("---------------");
		}
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

		System.out.println("������" + (System.currentTimeMillis() - yunxin)+"����");
		rili(year);
	}
	/**
	 * ���ظ����������
	 * @param year
	 */
	public static void rili(int year){
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
 * @param year
 * @param month
 * @param day
 * @return
 */
	public static int whatWeek_2(int year, int month, int day) {
		return (goDays(year) + days_1(month, year)+1) % 7;
	}
/**
 * ���ظ����굽1970����˶����죬
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
 * ���ظ������ڸ����������
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
	 * �ж��ǲ�������
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
