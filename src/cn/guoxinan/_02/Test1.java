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
		 栈stack
		 受限的线性表
		 只能在一端进行插入和删除这一端是栈顶，另一端是栈底
		 堆
		 先进先出，
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
		System.out.println("最大的数：" + max);
		System.out.println("最小的数：" + min);
	}

	public static void testTi_3() {
		int a = 654;
		int a1 = a / 100;
		int a2 = a % 100/ 10;
		int a3 = a % 10;
		System.out.println("百位数为：" + a1 + "\n十位数为：" + a2 + "\n个位数为：" + a3);
		System.out.println("so他们的和是：" + (a1 + a2 + a3));
	}

	public static void testCalculator() {
		int tage = 1;
		while (tage == 1) {
			System.out.println("请输入你的第一个数");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("请输入你的第二个数");
			int num2 = sc.nextInt();
			System.out.println("请输入你要进行的算法，1代表“+”2代表“-”3代表“*”4代表“/”进行除法是num2不能为0");
			int i = sc.nextInt();
			Calculator calculator = new Calculator(num1, num2);
			System.out.println("下面是你的计算结果");
			double result = calculator.Calculate(i);
		}
	}

	public static void testEmployee() {

		System.out.println("请输入员工信息每一个信息以回车结束");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入编号：");
		int num = sc.nextInt();
		System.out.print("请输入姓名：");
		String name = sc.next();
		System.out.print("请输入年龄：");
		int age = sc.nextInt();
		System.out.print("请输入邮箱：");
		String email = sc.next();
		System.out.print("请输入地址：");
		String address = sc.next();
		System.out.print("请输入性别：");
		String sex = sc.next();
		System.out.println("下面是你输入的编号为" + num + "的员工信息");
		Employee employee = Employee.getEmployee(num, name, age, email, address, sex);
		System.out.println("编号:\t" + employee.getNum() + "\n姓名:\t" + employee.getName() + "\n年龄：\t" + employee.getAge()
				+ "\n邮箱：\t" + employee.getEmail() + "\n地址:\t" + employee.getAddress() + "\n性别:\t" + employee.getSex());
		;
	}
}
