package cn.guoxinan._05;

public class Test2 {
	public static void main(String[] args) {
		
		Phone phone = new Phone("���ĵ��ֻ�");
		System.out.println(phone);
		// ���һ��
		phone.addPower();
		System.out.println(phone);
		// �Ÿ� С����
		phone.getMusic("С����");
		System.out.println(phone);
		// ���ظ���
		phone.addMusic("��˹�");
		System.out.println(phone);
		// �Ÿ� С����
		phone.getMusic("С����");
		System.out.println(phone);
		// �Ÿ� С����
		phone.getMusic("С����");
		System.out.println(phone);
		// �Ÿ� С����
		phone.getMusic("С����");
		System.out.println(phone);

	}
}
