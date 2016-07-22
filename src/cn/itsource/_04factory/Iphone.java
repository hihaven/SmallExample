package cn.itsource._04factory;

public class Iphone implements Phone{

	@Override
	public String call() {
		// TODO Auto-generated method stub
		System.out.println("我是一台高贵的iphone");
		return null;
	}

	@Override
	public String emg() {
		// TODO Auto-generated method stub
		return null;
	}
	public void cari(){
		System.out.println("我可以拍照");
	}

}
