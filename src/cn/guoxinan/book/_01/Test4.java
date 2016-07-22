package cn.guoxinan.book._01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fname="Test3.java";
		String destdir="src/cn/guoxinan/book";
		update(fname,destdir);
	}

	private static void update(String fname, String destdir) throws IOException {
		// TODO Auto-generated method stub
		File f1,f2,dest;
		f1=new File("src/cn/guoxinan/book/_01",fname);
		dest=new File(destdir);
		if(f1.exists()){
			if(!dest.exists())dest.mkdir();
			f2=new File(dest,fname);
			long d1=f1.lastModified();
			long d2=f2.lastModified();
			if((!f2.exists())||(f2.exists()&&(d1>d2))){
				copy(f1,f2);
			}
			showFileInfo(f1);
			showFileInfo(dest);
		}
		else{
			System.out.println(f1.getName()+" file not find");
		}
	}

	private static void showFileInfo(File f1) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm");
		if(f1.isFile()){
			String filepath=f1.getAbsolutePath();
			Date da=new  Date(f1.lastModified());
			String mat=sdf.format(da);
			System.out.println("\t"+filepath+"\t"+f1.length()+"\t"+mat);
		}
	}

	private static void copy(File f1, File f2) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);
		
		int count,n=512;
		
		byte buffer[]=new byte[n];
		count=fis.read(buffer,0,n);
		while(count!=-1){
			fos.write(buffer, 0, count);
			count=fis.read(buffer,0,n);
		}
		System.out.println("复制文件成功");
		fis.close();
		fos.close();
	}

}
