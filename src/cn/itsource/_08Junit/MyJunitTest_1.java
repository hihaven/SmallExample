package cn.itsource._08Junit;

import static org.junit.Assert.*;



import junit.framework.TestCase;

/**
 * 这是贺文的测试用例，我将在这里测试我的程序
 * @author heave
 *
 */
public class MyJunitTest_1 extends TestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("-------zai 运行程序之前");
	}
	public void testHello() throws Exception{
		System.out.println("--------------hello junit3.x");
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("----------在运行程序之后");
	}

}
