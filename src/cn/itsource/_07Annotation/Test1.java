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
			
			if("��".equals(annotation_1.sex())){
				System.out.println("����Ů�Ŀ���");
				if("��Ů".equals(annotation_1.likes())){
					System.out.println("����һ����Ů");
				}
			}else{
				System.out.println("ni kyi���Դ�����");
			}
		}
	}
}
