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
	 * ���xml�ĵ��е�����
	 * 
	 * @throws Exception
	 */
	public void getdoc() throws Exception {

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);
		// System.out.println(document);
		Element root = document.getDocumentElement();// �õ���Ԫ��

		NodeList nodelist = root.getElementsByTagName("linkman");// ���������õ�Ԫ��
		Element item = (Element) nodelist.item(0);
		NodeList nodeList2 = item.getElementsByTagName("name");
		Node item2 = nodeList2.item(0);
		String textContent = item2.getTextContent();
		System.out.println(textContent);

	}

	/**
	 * ����xml�ĵ��е�����
	 * 
	 * @throws Exception
	 */
	public void xmlUpdate() throws Exception {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);

		Element root = document.getDocumentElement();// ��Ԫ��
		NodeList nodelist = root.getElementsByTagName("linkman");
		Element node = (Element) nodelist.item(1);
		NodeList nodelist_2 = node.getElementsByTagName("name");
		Node node2 = nodelist_2.item(0);
		node2.setTextContent("haven_1");

		// NodeList nodeList2 = node.getElementsByTagName("email");
		// Node node3 = nodeList2.item(1);
		// node3.setTextContent("2@2.com");
		// ---------ͬ����ʼ
		TransformerFactory transformer = TransformerFactory.newInstance();
		Transformer former = transformer.newTransformer();
		Source soure = new DOMSource(document);
		Result result = new StreamResult(f);
		former.transform(soure, result);
		// ---------ͬ������

	}

	/**
	 * ��ú�����xml�ĵ��е�Ԫ������
	 * 
	 * @throws Exception
	 */
	public void xmlGetAttribute() throws Exception {
		DocumentBuilder documentbuiler = factory.newDocumentBuilder();
		Document document = documentbuiler.parse(f);

		Element element = document.getDocumentElement();// ��ø�Ԫ��
		NodeList elementsByTagName = element.getElementsByTagName("linkman");
		Element item = (Element) elementsByTagName.item(0);
		String nodeMap = item.getAttribute("id");
		System.out.println(nodeMap);
		// ����
		item.setAttribute("id", "2");
		// ͬ����ʼ
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer newTransformer = transformerFactory.newTransformer();
		Source source = new DOMSource(document);
		Result result = new StreamResult(f);
		newTransformer.transform(source, result);

		// ͬ������

	}

	/**
	 * xmlɾ��һ��Ԫ��
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
	 * ����һ��Ԫ��
	 * 
	 * @throws Exception
	 */
	public void xmlAddElement() throws Exception {
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(f);
		
		Element element = document.getDocumentElement();// ��ø�Ԫ��
		
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
		System.out.println("��ӳɹ�");
	}
}
