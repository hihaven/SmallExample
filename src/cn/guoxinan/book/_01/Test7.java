package cn.guoxinan.book._01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test7 {
	public String a="��Ҫ���ı�����";
	public int a1=1;
	public String toString(){
		System.out.println("-");
		return "success";
	}
	public void  testone(String name){
		System.out.println(name);
	}
	private void testtow(){
		System.out.println("����test7��˽�з���");
	}
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		
		System.out.println("��ȡָ����İ�����"+getcla()[0].getPackage().getName());
		System.out.println("��ȡָ��������η���"+getcla()[3].getModifiers());
		System.out.println("��ȡָ��������η���"+Modifier.toString((getcla()[3].getModifiers())));
		System.out.println("��ȡָ�������ȫ�޶�����"+getcla()[4].getName());
		System.out.println("��ȡָ����ĸ��ࣺ"+getcla()[4].getSuperclass());
		System.out.println("��ȡָ����ʵ�ֵĽӿ�(interface)��"+getcla()[4].getInterfaces()[0]);
		Field[] fields = getcla()[0].getDeclaredFields();
		for(Field i:fields){
			String modifiers =Modifier.toString(i.getModifiers());
			Class type = i.getType();
			String name = i.getName();
			if(type.isArray())
			System.out.println(modifiers+"\t"+(type.getComponentType().getName()+"[]")+"\t"+name);
			else
			System.out.println("���Ա�������η�"+modifiers+"\t����"+type+"\t����"+name);
		}
		Constructor[] con=getcla()[0].getDeclaredConstructors();
		for(Constructor i:con){
			String name=i.getName();
			String modifier=Modifier.toString(i.getModifiers());
			System.out.println("��ù��췽����"+name+"----���η�"+modifier);
			Class[] parameterTypes = i.getParameterTypes();
			for(int j=0;j<parameterTypes.length;j++){
				System.out.print("����"+j+"��"+parameterTypes[j].getName()+"    ");
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
	 * ��̬�ڲ���
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
	 * ��ȡclass��
	 * @return
	 * @throws ClassNotFoundException 
	 *@SuppressWarnings ȡ����ʾָ���ı���������
	 */
	@SuppressWarnings("rawtypes")
	public static Class[] getcla() throws ClassNotFoundException{
		Class cla[]=new Class[5];
		//��һ��
		A7 a=new A7();
		cla[0]=a.getClass();
		//�ڶ���
		cla[1]=Class.forName("cn.guoxinan.book._01.B7");
		//������
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