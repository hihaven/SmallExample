package cn.guoxinan.book._01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException{
//		System.out.println("input a String");
//		byte[] a=new byte[512];
//		//int count=System.in.read(a);
//		System.out.println("your String:");
		//for(int i=0;i<count;i++)
		//System.out.print((char)a[i]);
		
//		FileInputStream fi=new FileInputStream("src/cn/guoxinan/book/_01/Test3.java");
//		byte b[]=new byte[fi.available()];
////		while(fi.read(b)!=-1){
////			System.out.println(new String(b));
////		}
//		fi.read(b);
//		System.out.println(new String(b));
//		FileOutputStream out=new FileOutputStream("src/cn/guoxinan/book/data.txt");
//		byte b[]=new byte[512];
//		System.in.read(b);
//		out.write(b);
//		File f=new File("Test3.java");
//		String str1[]=f.list();
//		System.out.println(str1);
//		File mynewDir=new File("newdir");
//		mynewDir.mkdir();
//		File f=new File("newdir");
//		mynewDir.delete();
		String fname="Test3.java";
		String destdir="src/cn/guoxinan/book";
		update(fname,destdir);
	}

	private static void update(String fname, String destdir) throws IOException {
		File f1,f2,dest;
		f1=new File("src/cn/guoxinan/book/_01/",fname);dest=new File(destdir);
		if(f1.exists()){
			if(!dest.exists())
			dest.mkdir();
			else{
				System.out.println("you");
			}
			f2=new File(destdir,fname);
			copy(f1,f2);
		}
		else{
			System.out.println("not find");
		}
		
		
	}

	private static void copy(File f1, File f2) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fou=new FileOutputStream(f2);
		
		byte b[]=new byte[512];
		
		fin.read(b);
		System.out.println(new String(b));
		fou.write(b);
		fin.read(b);
		fin.close();
		fou.close();
	}	
}
