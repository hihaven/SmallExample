package cn.guoxinan._01;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws Exception{
		
		
//		Class<Haven> a=Haven.class;
//		Method getname = a.getDeclaredMethod("getName");
//		Haven haven=new Haven();
//		String str= (String) getname.invoke(haven);
//		System.out.println(str);
		
		Haven i=new Haven();
		System.out.println("姓名："+i.getName());
		System.out.println("年龄："+i.getAge());
		System.out.println("邮箱："+i.getEmail());
		System.out.println("地址："+i.getAddress());
		
		TI_2 ti=TI_2.getTI_2();
		System.out.println("输出以下图形");
		System.out.println("*\n**\n***\n****\n");
		System.out.println("输入回车执行");
		
		ti.ti_2();
		System.out.println("输出以下图形");
		System.out.println("*****\n*****\n*****\n*****\n");
		ti.ti_3();
//		double sum1=1,sum2=0;
//		for(int n=1;n<=20;n++){
//			
//			sum1=1;
//			for(int m=1;m<=n;m++){
//					sum1=sum1*m;
//					
//			}
//			System.out.println(n+"!="+sum1);
//			sum2=sum2+sum1;
//			System.out.println("sum2="+sum2);
//		}
		
//		int a,b;double c;a=5;b=-4;c=-a%3+b*6/(8.0-5)+6.3;
//		System.out.println(c);
		
//		int num2=101;
//		int sums=num2-->100?++num2>100?num2:100:200;
//		System.out.println(sums);
	}
	
}
