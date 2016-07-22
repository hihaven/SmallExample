package cn.itsource._07Annotation;

import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;


@Vip(name="abc",level=123, likes = "", sex = "")
public class HelloAnnotation {
		@Override
		public String toString(){
			return super.toString();
		}
		public void say(){
			@SuppressWarnings("rawtypes")
			List arr=new ArrayList();
		}
		@Deprecated
		public String toloacl(){
			System.out.println("haha");
			return "success";
		}
	
}
