package cn.itsource._07Annotation;

import java.lang.annotation.Annotation;

public class Test1 {
	public static void main(String[] args){
		Class clz=Persion.class;
		Annotation[] annotations = clz.getAnnotations();
		System.out.println(annotations.length);
		
		for(Annotation c:annotations){
			System.out.println(c);
		}
		Vip annotation_1 = (Vip) clz.getAnnotation(Vip.class);
		if(annotation_1!=null){
			
			if("男".equals(annotation_1.sex())){
				System.out.println("你是女的可以");
				if("美女".equals(annotation_1.likes())){
					System.out.println("你是一个美女");
				}
			}else{
				System.out.println("ni kyi可以打酱油了");
			}
		}
	}
}
