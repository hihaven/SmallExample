package cn.guoxinan._02;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// testEmployee();
		// testCalculator();
		// testTi_3();
		// testTi_4();
		testTi_5();
		
	}
	public static void testTi_6(){
		/*
		 ջstack
		 ���޵����Ա�
		 ֻ����һ�˽��в����ɾ����һ����ջ������һ����ջ��
		 ��
		 �Ƚ��ȳ���
		 */
	}
	public static void testTi_5() {
		int a=5,b=6;
		System.out.println("a:"+a+"b:"+b);
		int temp;
		temp=a;a=b;b=temp;
		System.out.println("a:"+a+"b:"+b);
	}

	public static void testTi_4() {
		int a = 5, b = 6, c = 7;
		int max = a > b ? a : b > c ? a > b ? a : b : c;
		int min = a < b ? a : b < c ? a < b ? a : b : c;
		System.out.println("��������" + max);
		System.out.println("��С������" + min);
	}

	public static void testTi_3() {
		int a = 654;
		int a1 = a / 100;
		int a2 = a % 100/ 10;
		int a3 = a % 10;
		System.out.println("��λ��Ϊ��" + a1 + "\nʮλ��Ϊ��" + a2 + "\n��λ��Ϊ��" + a3);
		System.out.println("so���ǵĺ��ǣ�" + (a1 + a2 + a3));
	}

	public static void testCalculator() {
		int tage = 1;
		while (tage == 1) {
			System.out.println("��������ĵ�һ����");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("��������ĵڶ�����");
			int num2 = sc.nextInt();
			System.out.println("��������Ҫ���е��㷨��1����+��2����-��3����*��4����/�����г�����num2����Ϊ0");
			int i = sc.nextInt();
			Calculator calculator = new Calculator(num1, num2);
			System.out.println("��������ļ�����");
			double result = calculator.Calculate(i);
		}
	}

	public static void testEmployee() {

		System.out.println("������Ա����Ϣÿһ����Ϣ�Իس�����");
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ţ�");
		int num = sc.nextInt();
		System.out.print("������������");
		String name = sc.next();
		System.out.print("���������䣺");
		int age = sc.nextInt();
		System.out.print("���������䣺");
		String email = sc.next();
		System.out.print("�������ַ��");
		String address = sc.next();
		System.out.print("�������Ա�");
		String sex = sc.next();
		System.out.println("������������ı��Ϊ" + num + "��Ա����Ϣ");
		Employee employee = Employee.getEmployee(num, name, age, email, address, sex);
		System.out.println("���:\t" + employee.getNum() + "\n����:\t" + employee.getName() + "\n���䣺\t" + employee.getAge()
				+ "\n���䣺\t" + employee.getEmail() + "\n��ַ:\t" + employee.getAddress() + "\n�Ա�:\t" + employee.getSex());
		;
	}
}
