package cn.guoxinan._03;

public class Test6 {

	public static void main(String[] args) {
		ti_1();
		ti_2();
	}

	public static void ti_1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	public static void ti_2() {
		int x = 1, y = 1, z = 1;
		for (x=1; x <= 30; x++) {
			for (y=1; y <= 30; y++) {
				for (z=1; z <= 30; z++) {
					if ((30 * x + 20 * y + 10 * z) == 500 && (x + y + z) == 30) {
						System.out.println("man:" + x + " \twoman:" + y + " \tchildren:" + z);
					}
				}
			}
		}
	}

}
