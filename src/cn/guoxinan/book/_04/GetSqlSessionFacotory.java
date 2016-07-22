package cn.guoxinan.book._04;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSessionFacotory {
	private static SqlSessionFactory sqlSessionFactory=null;
	static{
		try {
			InputStream is=Resources.getResourceAsStream("cn/guoxinan/book/_04/config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" ß∞‹¡À");
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlsessionFactory(){
		System.out.println("sb");
		return sqlSessionFactory;
	}
}
