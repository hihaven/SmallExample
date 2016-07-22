package cn.guoxinan.book._01;

public class Test5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			a a=new a();
			Test5.B b=new Test5.B();
			b.setPriority(10);
			System.out.println(a.getPriority()+"  "+b.getPriority());
			a.start();
			b.start();
			Test5.C c=new Test5.C();
			Thread c1=new Thread(c);
			c1.setPriority(1);
			c1.start();
	}
	static class B extends Thread{
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("===="+i);
			}
		}
	}
	static class  C implements  Runnable {
		public  void run() {
			for(int i=0;i<10;i++){
				System.out.println("====+++++"+i);
			}
		}
	}

}
 class a extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("___"+i);}
	}
}