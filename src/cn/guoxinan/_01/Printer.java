package cn.guoxinan._01;

import java.util.Scanner;

/**
 * �ӿڵļ̳� page116ʵ�ֽӿڷ����ǣ�����ʹ��public���ʿ������η�����Ϊ�ӿ���ķ�������public��
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
				System.out.println("��ӡ����ӡ��" + printdata[0]);
				System.arraycopy(printdata, 1, printdata, 0, --datanum);
//			}
		}
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if (datanum >= MAX) {
			System.out.println("�����Ѿ����ˣ����ʧ��");
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
