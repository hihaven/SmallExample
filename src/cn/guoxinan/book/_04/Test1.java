package cn.guoxinan.book._04;

import org.apache.ibatis.session.SqlSession;

public class Test1 {
	public static void main(String[] args){
		SqlSession session=GetSqlSessionFacotory.getSqlsessionFactory().openSession();
		Sc sc=(Sc)session.selectOne("abc.getxuehao",92);
		System.out.println(sc);
		session.close();
	}
}
