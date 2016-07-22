package cn.guoxinan._04;

/*
 * 具有相同属性和行为的对象的抽象
 * 对象：客观存在的类的具体。
 * 类和对象的关系，
 * 	1.类是对象的抽象，对象是类的具体
 *  2.类是对象的模板，对象是类的产品。
 *  类的定义语法，[修饰符] class 类名 {
 *  		//属性
 *  		//方法
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
	 * 第三题测试
	 */
	Student stu01=new Student("小明", "男", 18, 1, 100,180);
	Student stu02=new Student("小李","男",18,2,120,190);
	Student stu03=new Student("小张","女",16,3,75,170);
	System.out.println(stu01+"\n比例"+stu01.weight_high());
	System.out.println(stu02+"\n比例"+stu02.weight_high());
	System.out.println(stu03+"\n比例"+stu03.weight_high());
	//比较两人的身高
	if(stu01.high_other(stu02.high)){
		System.out.println(stu01.name+"高于"+stu02.name);
	}else System.out.println(stu01.name+"矮于"+stu02.name);
	if(stu01.high_other(stu03.high)){
		System.out.println(stu01.name+"高于"+stu03.name);
	}else System.out.println(stu01.name+"矮于"+stu02.name);
	//找出最高的人
	System.out.println("最高的人是："+stu01.high_two(stu02, stu03));
	System.out.println("----------------------------------我是分割线-----------");
	Calculator cal=new Calculator(1,2);
	System.out.println(cal.add());
	System.out.println("----------------------------------我是分割线-----------");
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
