package cn.guoxinan._03;

public class Test5 {

	public static void main(String[] args) {
		test2();

	}

	public static void test1() {
		double b = 0.003;
		double sum = 10000;
		for (int i = 1; i <= 8; i++) {
			System.out.println(i + "年的本金是" + sum + "\t这一年的利息" + sum * b);
			
			sum*=1.003;

		}
		System.out.println(sum);
	}
	public static void test2(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
