package cn.guoxinan._05;

public class Test3 {
	public static void main(String [] args){
		Admin admin01=new Admin();
		admin01.setName("张三01");admin01.setPassword("123456");
		Admin admin02 =new Admin();
		admin02.setName("张三02");admin02.setPassword("123456");
		
		Admin admin03=new Admin("张三","123456");
		Admin admin04=new Admin("张三","123456");
		Admin admin05=new Admin("张三","123456");
		
		Admin admin[]={admin01,admin02,admin03,admin04,admin05};
		for(Admin i:admin)System.out.println(i);
	}
}
