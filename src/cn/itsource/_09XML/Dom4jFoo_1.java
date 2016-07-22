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
	 * 拿到一个 节点 的文本
	 * @throws Exception
	 * @parameter 参数
	 * @return 返回值
	 * @version 版本
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
	 * 这是一个Dom4j编辑xml文档
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
	 * 使用dom4j为xml添加元素
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
		//为我们写入设置一个漂亮的格式-------但是我没感觉到什么变化
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
	 * 使用dom4j获取属性
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
	 * 使用dom4j设置属性
	 * @throws Exception
	 */
	public void dom4jaddAttribute() throws Exception{
		File f=new File("src/cn/itsource/_09XML/Mydtdxml.xml");
		SAXReader reader=new SAXReader();
		Document document = reader.read(f);
		Element rootElement = document.getRootElement();
		Element linkman = (Element) rootElement.elements("linkman").get(1);
		linkman.addAttribute("id","999");
		//一定要同步
		FileWriter out=new FileWriter(f);
		document.write(out);
		out.close();
	}
	/**
	 * @param int a 需要输入一个参数a代表要删除的第一个元素
	 * @see 使用dom4j删除一个元素
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
	 * 新建一个xml
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void dom4jAddXML() throws IOException, FileNotFoundException{
		Element root=DocumentHelper.createElement("persion");
		Document document =DocumentHelper.createDocument(root);
		root.addAttribute("学校", "成都文理学院");
		Element addElement = root.addElement("学生");
		addElement.addElement("姓名").addText("小张");
		addElement.addElement("年龄").addText("20");
		
		
		OutputFormat format=new OutputFormat(" ",true);
		format.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/cn/itsource/_09XML/Person.xml"),format);  
	      
        xmlWriter.write(document);  
        xmlWriter.close();  
	}

}
