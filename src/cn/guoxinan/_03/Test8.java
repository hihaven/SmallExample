package cn.guoxinan._03;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a={10,20,30,40,50};
		// int[] b=new int[a.length];
		// for(int i=0;i<a.length;i++){
		// b[i]=a[i];
		// }

		// System.arraycopy(a, 0, b, 0, a.length);
		//
		// for(int i:b){
		// System.out.println(i);
		// }
		// char []a=new char[100];
		// for(int i=0;i<a.length;i++){
		// int b=((int)(Math.random()*26)+65);
		// a[i]=(char)b;
		// System.out.println(a[i]);
		// }
		//
		// for(int i=65;i<=90;i++){
		// char zm=(char)i;int counts=0;
		// for(int j=0;j<a.length;j++){
		// if(a[j]==zm)counts++;
		// }System.out.println(zm+" "+counts);
		// }
		//
		// int []arra={22,11,44,55,33,66};
		// int b=0,c=arra[0],d=0;
		// for(int i=0;i<arra.length;i++){
		// if(arra[i]>b)b=arra[i];
		// if(c>arra[i])c=arra[i];
		// d=d+arra[i];
		// }
		// System.out.println("最大值"+b);
		// System.out.println("最小值"+c);
		// System.out.println("平均值"+d/arra.length);
		// Arrays.sort(arra);
		// for(int i:arra)System.out.println("排序"+i);
		//

/*		*//**
		 * 二分查找法
		 *//*
		long lo=System.currentTimeMillis();	
		int serach = 3;
		int[] arrays = { 1, 2, 3, 4, 5, 6, 7,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1, 8, 9, 10, 20, 30, 40, };
		int ind = -1, start = 0, end = arrays.length - 1, mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if (serach == arrays[mid]) {
				ind = mid;
				System.out.println(arrays[ind]); break;
			}else if(serach>arrays[mid]){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		System.out.println(System.currentTimeMillis()-lo);
		
		long lon=System.currentTimeMillis();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1, 10, 20, 30, 40, };
		int ser=30;
		for(int i=0;i<arr.length;i++){
			if(ser==arr[i]){System.out.println("+++++"+i+"===="+arr[i]);break;}
		}
		System.out.println(System.currentTimeMillis()-lon);*/
		
		int[] array={10,20,30,40,50,60,70,80};
		int num=50;
		int index=-1;
		for(int i=0;i<array.length;i++){
			if(num<=array[i]){
				index=i;break;
			}
		}System.out.println(index);
		int []array1=new int[array.length+1];
		for(int i=0;i<array1.length;i++){
			if(i<index)array1[i]=array[i];
			if(i==index){
				array1[i]=num;
			}if(i>index)
			array1[i]=array[i-1];
		}
		for(int i:array1){
			System.out.println(i);
		}
	}

}
