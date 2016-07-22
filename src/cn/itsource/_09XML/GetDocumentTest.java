package cn.itsource._09XML;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.dom4j.Document;

import junit.framework.TestCase;

public class GetDocumentTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetdoc() {
		System.out.println("kaishi");
		GetDocument a=new GetDocument();
		try {
			a.getdoc();
			//a.xmlUpdate();
			//a.xmlGetAttribute();
			//a.xmlDelete();
			//a.xmlAddElement();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testDom4j() throws Exception{
		Dom4jFoo_1 a=new Dom4jFoo_1();
	    //a.dom4j();
	   //  a.dom4jEdit();
		//a.dom4jAdd();
		//a.dom4jGetAttribute();
		//a.dom4jaddAttribute();
		//a.dom4jDeleteElement(2);
		a.dom4jAddXML();
	}

}
