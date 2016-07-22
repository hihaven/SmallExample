package cn.guoxinan._01;

import java.util.Scanner;

/**
 * 接口的继承 page116实现接口方法是，必须使用public访问控制修饰符，因为接口里的方法都是public的
 * 
 * @author heave
 *
 */
public class Printer implements Output, Product {
	private String[] printdata = new String[MAX];
	private int datanum = 0;

	@Override
	public int getProduceTime() {
		// TODO Auto-generated method stub
		return 45;
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		while (datanum > 0) {
//			System.out.println("begin print key 1");
//			Scanner sc = new Scanner(System.in);
//			if (sc.nextInt() == 1) {
				System.out.println("打印机打印：" + printdata[0]);
				System.arraycopy(printdata, 1, printdata, 0, --datanum);
//			}
		}
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if (datanum >= MAX) {
			System.out.println("队列已经满了，添加失败");
		} else {
			printdata[datanum++] = msg;
		}
	}

	public static void main(String[] args) {
		Output o = new Printer();
		Product p = new Printer();
		o.getData("this is one");
		o.getData("this is tow");
		o.out();
		System.out.println(p.getProduceTime());
		Object obj=p;
	}

}
