package MAIN;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import CONTROL.ControlS;
import generated.WordDefinition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mainS extends Application{

	/*public static void main(String[] args) throws JAXBException, JDOMException, IOException {
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

	}*/
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			AnchorPane root=null;
			
			ControlS c=new ControlS();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/VIEW/FinestraS.fxml"));
			fxmlLoader.setRoot(root);
			fxmlLoader.setController(c);
			root=fxmlLoader.load();
			
			c.setRoot(primaryStage, root);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/VIEW/styleS.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
