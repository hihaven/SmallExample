package cn.itsource._08Junit;

import static org.junit.Assert.*;



import junit.framework.TestCase;

/**
 * ���Ǻ��ĵĲ����������ҽ�����������ҵĳ���
 * @author heave
 *
 */
public class MyJunitTest_1 extends TestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("-------zai ���г���֮ǰ");
	}
	public void testHello() throws Exception{
		System.out.println("--------------hello junit3.x");
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("----------�����г���֮��");
	}

}
