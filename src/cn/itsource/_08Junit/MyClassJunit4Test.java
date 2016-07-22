package cn.itsource._08Junit;

import java.lang.reflect.Method;

import junit.framework.TestCase;

public class MyClassJunit4Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("--≤‚ ‘÷Æ«∞");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("ce  shi zhi hou");
	}

	public void testAdd() throws NoSuchMethodException, SecurityException {
		MyClass a=new MyClass();
		a.add(1);
		
		
	}

	public void testSayhi() {
		System.out.println("----------");
	}

}
