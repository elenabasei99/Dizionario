package MAIN;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import generated.WordDefinition;

public class main {

	public static void main(String[] args) throws JAXBException, JDOMException, IOException {
		URL f = new URL("http://services.aonaware.com/DictService/DictService.asmx/Define?word=beach");
		
		SAXBuilder builder = new SAXBuilder();
		Document document = (Document) builder.build(f); // Creo il
		// documento
		// System.out.println(document.toString());

		Element rootNode = document.getRootElement(); // Recupero l'elemento
		// del nodo root
		Namespace ns = Namespace.getNamespace("http://services.aonaware.com/webservices/");
		Element e = rootNode.getChild("Word", ns);
		System.out.println(rootNode.getChild("Definitions",ns).getChild("Definition",ns).getChildText("WordDefinition",ns));
		
		System.out.println(rootNode.getChild("Definitions",ns).getChildren("Definition",ns).get(1).getChildText("WordDefinition",ns));

	}

}
