package cn.guoxinan._04;

/*
 * ������ͬ���Ժ���Ϊ�Ķ���ĳ���
 * ���󣺿͹۴��ڵ���ľ��塣
 * ��Ͷ���Ĺ�ϵ��
 * 	1.���Ƕ���ĳ��󣬶�������ľ���
 *  2.���Ƕ����ģ�壬��������Ĳ�Ʒ��
 *  ��Ķ����﷨��[���η�] class ���� {
 *  		//����
 *  		//����
 *  }
 * @author heave
 *
 */
public class Test01 {
	public static void main(String[] args){
	Present present = Present.getinstance();
	present.name="flower";
	present.price=20;
	System.out.println(present);
	Present present_1=Present.getinstance();
	present_1.name="abc";
	present_1.price=20;
	System.out.println(present_1);
	System.out.println(TimeNow.get().date);
	
	/*
	 * ���������
	 */
	Student stu01=new Student("С��", "��", 18, 1, 100,180);
	Student stu02=new Student("С��","��",18,2,120,190);
	Student stu03=new Student("С��","Ů",16,3,75,170);
	System.out.println(stu01+"\n����"+stu01.weight_high());
	System.out.println(stu02+"\n����"+stu02.weight_high());
	System.out.println(stu03+"\n����"+stu03.weight_high());
	//�Ƚ����˵����
	if(stu01.high_other(stu02.high)){
		System.out.println(stu01.name+"����"+stu02.name);
	}else System.out.println(stu01.name+"����"+stu02.name);
	if(stu01.high_other(stu03.high)){
		System.out.println(stu01.name+"����"+stu03.name);
	}else System.out.println(stu01.name+"����"+stu02.name);
	//�ҳ���ߵ���
	System.out.println("��ߵ����ǣ�"+stu01.high_two(stu02, stu03));
	System.out.println("----------------------------------���Ƿָ���-----------");
	Calculator cal=new Calculator(1,2);
	System.out.println(cal.add());
	System.out.println("----------------------------------���Ƿָ���-----------");
	Admin admin=new Admin();
	System.out.println(admin);
//	for(int i=1;i<=5;i++){
//		String s="admin0"+i;
//		Admin s1=new Admin();
//	}
	Admin admin01=new Admin();
	Admin admin02=new Admin();
	Admin admin03=new Admin();
	Admin admin04=new Admin();
	Admin admin05=new Admin();
	Admin[] adm={admin01,admin02,admin03,admin04,admin05};
	for(Admin i:adm){
		System.out.println(admin);
	}
	}
}
