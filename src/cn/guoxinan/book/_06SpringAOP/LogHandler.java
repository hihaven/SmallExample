package cn.guoxinan.book._06SpringAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class LogHandler implements InvocationHandler{

	private Object sub;
	public LogHandler() {
		super();
	}
	public LogHandler(Object obj){
		sub=obj;
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		System.out.println("befor you do thing");
		arg1.invoke(sub, arg2);
		System.out.println("after you do thing ");
		return null;
		
	}

}
