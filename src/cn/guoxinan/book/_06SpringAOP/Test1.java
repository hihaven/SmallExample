package cn.guoxinan.book._06SpringAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test1 {
	public static void main(String[] args){
		HelloSpeaker h=new HelloSpeaker();
		LogHandler log=new LogHandler(h);
		Class clz=h.getClass();
		IHello ih=(IHello) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), log);
		//IHello ih=(IHello)Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), log);
		ih.hello("world");
	}
}