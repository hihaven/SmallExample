package cn.guoxinan._01;

public class TI_2 {
	private String a="============================";
	private String b="=======";
	private TI_2() {
	}

	private static TI_2 ti_2;
	static {
		ti_2 = new TI_2();
	}
	/**
	 * ͨ��������ö���
	 * @return
	 */
	public static TI_2 getTI_2() {
		return ti_2;
	}
	/**
	 * �����һ��ͼ�� ������������
	 * @author heave
	 * @since 2016��7��11��16:40:44
	 */
	public void ti_2() {
		System.out.println("�ҿ�ʼ��Ӵ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
/**
 * ����ڶ���ͼ�� �����ھ���
 * @author heave
 * @since 2016��7��11��16:40:57
 */
	public void ti_3() {
		System.out.println("�ҿ�ʼ��Ӵ");
		for (int j = 0; j <= 3; j++) {
			for (int i = 0; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * ��ӡһ�� ��ҳҳ��
	 * @author heave
	 * @since 2016��7��11��16:52:24
	 * 
	 */
	public void ti_4(){
		System.out.println("�ҿ�ʼ��Ӵ");
		System.out.println(a);
		System.out.println("��ӭʹ��Ա������ϵͳ");
		System.out.println(a);
		System.out.println("      �����б�");
		System.out.println(b+"1.��ʾ����Ա����Ϣ"+b);
		System.out.println(b+"2.���Ա����Ϣ"+b);
		System.out.println(b+"3.�޸�Ա����Ϣ"+b);
		System.out.println(b+"4.�鿴Ա����Ϣ"+b);
		System.out.println(b+"5.�˳�ϵͳ"+b);
		System.out.println(a);
	}
}
