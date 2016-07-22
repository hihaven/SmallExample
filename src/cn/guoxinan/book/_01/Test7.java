package cn.guoxinan.book._01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test7 {
	public String a="你要来改变我吗";
	public int a1=1;
	public String toString(){
		System.out.println("-");
		return "success";
	}
	public void  testone(String name){
		System.out.println(name);
	}
	private void testtow(){
		System.out.println("这是test7的私有方法");
	}
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		
		System.out.println("获取指定类的包名："+getcla()[0].getPackage().getName());
		System.out.println("获取指定类的修饰符："+getcla()[3].getModifiers());
		System.out.println("获取指定类的修饰符："+Modifier.toString((getcla()[3].getModifiers())));
		System.out.println("获取指定类的完全限定名："+getcla()[4].getName());
		System.out.println("获取指定类的父类："+getcla()[4].getSuperclass());
		System.out.println("获取指定类实现的接口(interface)："+getcla()[4].getInterfaces()[0]);
		Field[] fields = getcla()[0].getDeclaredFields();
		for(Field i:fields){
			String modifiers =Modifier.toString(i.getModifiers());
			Class type = i.getType();
			String name = i.getName();
			if(type.isArray())
			System.out.println(modifiers+"\t"+(type.getComponentType().getName()+"[]")+"\t"+name);
			else
			System.out.println("类成员变量修饰符"+modifiers+"\t类型"+type+"\t名称"+name);
		}
		Constructor[] con=getcla()[0].getDeclaredConstructors();
		for(Constructor i:con){
			String name=i.getName();
			String modifier=Modifier.toString(i.getModifiers());
			System.out.println("获得构造方法名"+name+"----修饰符"+modifier);
			Class[] parameterTypes = i.getParameterTypes();
			for(int j=0;j<parameterTypes.length;j++){
				System.out.print("参数"+j+"："+parameterTypes[j].getName()+"    ");
			}System.out.println();
		}
		Method method = getcla()[0].getMethod("sayHi");
		System.out.println(method);
		System.out.println(method.getModifiers()+method.getName()+method.getReturnType());
		Method[] methods = getcla()[0].getMethods();
		for(Method i:methods){
			System.out.println(i.getName());
			System.out.println(i.getReturnType().getName());
		}
		System.out.println(Class.forName("cn.guoxinan.book._01.A7").newInstance().toString());
	}
	/**
	 * 静态内部类
	 * @author heave
	 *
	 */
	static class D7 extends Test7 implements  Runnable {
		public void run() {
			
		}
	
		public String a;
		public void sayHi(){
			System.out.println("A");
		}
	}
	
	/**
	 * 获取class类
	 * @return
	 * @throws ClassNotFoundException 
	 *@SuppressWarnings 取消显示指定的编译器警告
	 */
	@SuppressWarnings("rawtypes")
	public static Class[] getcla() throws ClassNotFoundException{
		Class cla[]=new Class[5];
		//第一种
		A7 a=new A7();
		cla[0]=a.getClass();
		//第二种
		cla[1]=Class.forName("cn.guoxinan.book._01.B7");
		//第三种
		cla[2]=C7.class;
		//
		cla[3]=Test7.class;
		//
		cla[4]=D7.class;
		return cla;
	}

}

class A7{
	public A7(){}
	private A7(String a,int b){}
	public String a;
	public String sayHi(){
		System.out.println("A");
		return a;
	}
	public String toString(){
		return "success this is a7";
	}
}

class B7{
	public String a;
	public void sayHi(){
		System.out.println("B");
	}
}

class C7{
	public String a;
	public void sayHi(){
		System.out.println("C");
	}
}