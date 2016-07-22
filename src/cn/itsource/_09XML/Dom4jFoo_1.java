package cn.itsource._09XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jFoo_1 {
	
	/**
	 * �õ�һ�� �ڵ� ���ı�
	 * @throws Exception
	 * @parameter ����
	 * @return ����ֵ
	 * @version �汾
	 */
	public void dom4j() throws Exception {
		File file = new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader reader = new SAXReader();
		Document read = reader.read(file);
		System.out.println(read);
		Element root = read.getRootElement();
		List<Element> linkmanlist = root.elements("linkman");

		Element linkman = linkmanlist.get(1);

		Element name = linkman.element("name");
		System.out.print(name.getText());

	}
	/**
	 * @since 
	 * ����һ��Dom4j�༭xml�ĵ�
	 * @throws Exception
	 */
	public void dom4jEdit() throws Exception{
		File file=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader reader=new SAXReader();
		Document read = reader.read(file);
		Element rootElement = read.getRootElement();
		List<Element> elements = rootElement.elements("linkman");
		
		Element linkman=elements.get(1);
		Element name = linkman.element("name");
		name.setText("haven");
		FileWriter out=new FileWriter(file);
		read.write(out);
		out.close();
	}
	/**
	 * ʹ��dom4jΪxml���Ԫ��
	 * @throws Exception
	 */
	public void dom4jAdd() throws Exception{
		File file=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader reader=new SAXReader();
		Document read = reader.read(file);
		Element rootElement = read.getRootElement();
		
		Element linkman = rootElement .addElement("linkman");
		linkman.addElement("name").setText("zhangsan");
		linkman.addElement("email").setText("4@4.com");
		linkman.addElement("address").setText("chengdu");
		
		FileWriter out=new FileWriter(file);
		read.write(out);
		out.close();
		//Ϊ����д������һ��Ư���ĸ�ʽ-------������û�о���ʲô�仯
		//lets write to a file
		XMLWriter writer=new XMLWriter(new FileWriter("src/cn/itsource/_09XML/output.xml"));
		writer.write(read);
		//pretty print the document to System.out
		OutputFormat format=OutputFormat.createPrettyPrint();
		writer=new XMLWriter(System.out,format);
		writer.write(read);
		writer.close();
		
	}
	/**
	 * ʹ��dom4j��ȡ����
	 * @throws Exception
	 */
	public void dom4jGetAttribute() throws Exception{
		File f=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		
		SAXReader reader=new SAXReader();
		Document document = reader.read(f);
		Element rootElement = document.getRootElement();
		Element linkman = (Element) rootElement.elements("linkman").get(0);
		System.out.println( linkman.attributeValue("id"));
	}
	/**
	 * ʹ��dom4j��������
	 * @throws Exception
	 */
	public void dom4jaddAttribute() throws Exception{
		File f=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader reader=new SAXReader();
		Document document = reader.read(f);
		Element rootElement = document.getRootElement();
		Element linkman = (Element) rootElement.elements("linkman").get(1);
		linkman.addAttribute("id","999");
		//һ��Ҫͬ��
		FileWriter out=new FileWriter(f);
		document.write(out);
		out.close();
	}
	/**
	 * @param int a ��Ҫ����һ������a����Ҫɾ���ĵ�һ��Ԫ��
	 * @see ʹ��dom4jɾ��һ��Ԫ��
	 * @throws Exception
	 * 
	 */
	public void dom4jDeleteElement(int a) throws Exception{
		File f=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader read=new SAXReader();
		Document document = read.read(f);
		Element rootElement = document.getRootElement();
		Element linkman = (Element) rootElement.elements("linkman").get(a);
		linkman.getParent().remove(linkman);
		FileWriter out=new FileWriter(f);
		document.write(out);
		out.close();
	}
	/**
	 * �½�һ��xml
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void dom4jAddXML() throws IOException, FileNotFoundException{
		Element root=DocumentHelper.createElement("persion");
		Document document =DocumentHelper.createDocument(root);
		root.addAttribute("ѧУ", "�ɶ�����ѧԺ");
		Element addElement = root.addElement("ѧ��");
		addElement.addElement("����").addText("С��");
		addElement.addElement("����").addText("20");
		
		
		OutputFormat format=new OutputFormat(" ",true);
		format.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/cn/itsource/_09XML/Person.xml"),format);  
	      
        xmlWriter.write(document);  
        xmlWriter.close();  
	}

}
