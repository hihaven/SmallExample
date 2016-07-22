package cn.itsource._09XML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GetDocument {
	File f = new File("src/cn/itsource/_09XML/Mydtdxml.xml");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	/**
	 * 获得xml文档中的数据
	 * 
	 * @throws Exception
	 */
	public void getdoc() throws Exception {

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);
		// System.out.println(document);
		Element root = document.getDocumentElement();// 拿到根元素

		NodeList nodelist = root.getElementsByTagName("linkman");// 根据名称拿到元素
		Element item = (Element) nodelist.item(0);
		NodeList nodeList2 = item.getElementsByTagName("name");
		Node item2 = nodeList2.item(0);
		String textContent = item2.getTextContent();
		System.out.println(textContent);

	}

	/**
	 * 更新xml文档中的数据
	 * 
	 * @throws Exception
	 */
	public void xmlUpdate() throws Exception {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);

		Element root = document.getDocumentElement();// 根元素
		NodeList nodelist = root.getElementsByTagName("linkman");
		Element node = (Element) nodelist.item(1);
		NodeList nodelist_2 = node.getElementsByTagName("name");
		Node node2 = nodelist_2.item(0);
		node2.setTextContent("haven_1");

		// NodeList nodeList2 = node.getElementsByTagName("email");
		// Node node3 = nodeList2.item(1);
		// node3.setTextContent("2@2.com");
		// ---------同步开始
		TransformerFactory transformer = TransformerFactory.newInstance();
		Transformer former = transformer.newTransformer();
		Source soure = new DOMSource(document);
		Result result = new StreamResult(f);
		former.transform(soure, result);
		// ---------同步结束

	}

	/**
	 * 获得和设置xml文档中的元素属性
	 * 
	 * @throws Exception
	 */
	public void xmlGetAttribute() throws Exception {
		DocumentBuilder documentbuiler = factory.newDocumentBuilder();
		Document document = documentbuiler.parse(f);

		Element element = document.getDocumentElement();// 获得根元素
		NodeList elementsByTagName = element.getElementsByTagName("linkman");
		Element item = (Element) elementsByTagName.item(0);
		String nodeMap = item.getAttribute("id");
		System.out.println(nodeMap);
		// 设置
		item.setAttribute("id", "2");
		// 同步开始
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer newTransformer = transformerFactory.newTransformer();
		Source source = new DOMSource(document);
		Result result = new StreamResult(f);
		newTransformer.transform(source, result);

		// 同步结束

	}

	/**
	 * xml删除一个元素
	 * 
	 * @throws Exception
	 */
	public void xmlDelete() throws Exception {
		DocumentBuilder documentbuiler = factory.newDocumentBuilder();
		Document document = documentbuiler.parse(f);

		Element element = (Element) document.getElementsByTagName("linkman").item(1);
		element.getParentNode().removeChild(element);

		TransformerFactory transformerFactoy = TransformerFactory.newInstance();
		Transformer newTransformer = transformerFactoy.newTransformer();
		Source source = new DOMSource(document);
		Result result = new StreamResult(f);
		newTransformer.transform(source, result);

	}

	/**
	 * 增加一个元素
	 * 
	 * @throws Exception
	 */
	public void xmlAddElement() throws Exception {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);
		
		Element element = document.getDocumentElement();// 获得根元素
		
		Element createElement = document.createElement("linkman");
		element.appendChild(createElement);

		Element name = document.createElement("name");
		name.setTextContent("mengjiangxiong");
		createElement.appendChild(name);
		Element email = document.createElement("email");
		email.setTextContent("xxx@163.com");
		createElement.appendChild(email);
		Element address = document.createElement("address");
		address.setTextContent("sandong");
		createElement.appendChild(address);
		
		TransformerFactory transformerFactoy = TransformerFactory.newInstance();
		Transformer newTransformer = transformerFactoy.newTransformer();
		Source source = new DOMSource(document);
		Result result = new StreamResult(f);
		newTransformer.transform(source, result);
		System.out.println("添加成功");
	}
}
