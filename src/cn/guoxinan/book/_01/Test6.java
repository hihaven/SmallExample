package cn.guoxinan.book._01;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6.tic t=new Test6.tic();
		th a=new th(t,"a");
		th a1=new th(t,"a2");
		
		
	}
	static class tic{
		public int tic;
		public tic(){
			tic=10;
		}
		public synchronized void qiang(String name){
			System.out.println(name+"  "+this.tic);
			this.tic--;
		}
	}
static	class th extends Thread{
		tic  t;String name;
		public  th(tic t,String name){
			this.t=t;this.name=name;
			start();
		}
		
		public void run(){
			for(int i=0;i<5;i++){
				t.qiang(name);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
