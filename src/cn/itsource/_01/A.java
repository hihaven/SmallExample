package cn.itsource._01;

import java.util.ArrayList;
import java.util.List;

public abstract class A extends B implements c{
	public String name;
	public List<Integer> list=new ArrayList<Integer>();
	
	public A() {
		super();
	}
	public A(String name) {
		super();
		this.name = name;
	}
	private void t1(){
		System.out.println("a t1");
	}
	public void t2(int i){
		System.out.println("a t2");
	}
	public void t3(String s,int i){
		System.out.println(" a t3");
	}
	
}
