package cn.itsource._01;

import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class Test1 {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		/**
		 * ����һ�����췽��
		 */
		// Class clz=Persion.class;
		// Constructor<Persion> con = clz.getConstructor(String.class);
		// Persion p1=new Persion();
		// Persion p2=new Persion("xioa");
		// Class<Persion> clz=Persion.class;
		// Constructor<Persion> con=clz.getConstructor(String.class);
		// con.setAccessible(true);
		// Persion p=con.newInstance("xiao");
		// System.out.println(p);
		// Class clza=A.class;
		// Method m1 = clza.getMethod("t2", int.class);//��ȡ�����й�����
		// System.out.println(m1);
		// Method m2 = clza.getMethod("tb2", int.class);//��ȡ�����е�
		// System.out.println(m2);
		// Method m3 = clza.getMethod("t5");//�ӿ��е�
		// System.out.println(m3);

		// Method[] ms = clza.getMethods();
		// for(Method m:ms){
		// System.out.println(m);
		// }
		// Class<A> clza=A.class;
		// Method m = clza.getMethod("t3", String.class,int.class);
		//
		// m.invoke(null, "sadf",10);

		/**
		 * ͨ����������������еķ���
		 */
//		 Class<Persion> clz=Persion.class;
//		 Method m1 = clz.getDeclaredMethod("setName",String.class);
//		 Persion p=new Persion();
//		 m1.invoke(p, "xiaoming");
//		 //System.out.println(p);
//		 Method m2 = clz.getDeclaredMethod("prisetName",String.class);
//		 //��m2�������ʧȥ����Ȩ�޼�������
//		 m2.setAccessible(true);
//		 Persion p1=new Persion();
//		 m2.invoke(p1, "haven");
		/**
		 * ͨ����������ֶ�
		 */
		// Persion p=new Persion();
		// Class<Persion> clz=Persion.class;
		// Field f=clz.getDeclaredField("name");//����ֶ�name
		// f.setAccessible(true);
		// System.out.println(f.get(p));
		// f.set(p, "xiaomi");
		// System.out.println(f.get(p));
		// System.out.println(p.getName());
		/**
		 * ͨ���������ֶε�����
		 */
		// Class<A> clz=A.class;
		// Field f=clz.getField("name");
		// System.out.println(f.getType());//��ʶfield�����ʶ�ֶε���������
		//
		// Field f1 = clz.getField("list");
		// System.out.println(f1.getGenericType());
		/**
		 * ������η�
		 */
		// Class<A> clz=A.class;
		// int mo1 = clz.getModifiers();
		// String str=Modifier.toString(mo1);
		// System.out.println(str);
		/**
		 * ���ʵ�ֵĽӿ�
		 */
		// Class<Test> clz=Test.class;
		// Class<?>[] clzs = clz.getInterfaces();
		// for(Class c:clzs){
		// System.out.println(c);
		// }
		/**
		 * ����������
		 */
		// Class<Test> clz=Test.class;
		// ClassLoader classLoader = clz.getClassLoader();
		// System.out.println(classLoader);
		/**
		 * ������͵ļ��
		 */
		// Class<Test> clz=Test.class;
		// System.out.println(clz);
		// System.out.println(clz.getName());
		// System.out.println(clz.getSimpleName());
		/**
		 * 
		 */
		// Class<Persion> clz=Persion.class;
		// Constructor[] cons =clz.getDeclaredConstructors();
		// for(Constructor c : cons){
		// System.out.println(c);
		// }
		// Constructor<Persion> con = clz.getDeclaredConstructor(String.class);
		// con.setAccessible(true);
		// Persion p=con.newInstance("xiaoming");
		// System.out.println(p);
	}
}

abstract class Test implements ActionListener, List {

}
