package CONTROL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import MAIN.MainP;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlS implements Initializable {
	private Stage stage;
	private AnchorPane root;

	public void setRoot(Stage stage, AnchorPane root) {
		this.stage = stage;
		this.root = root;

	}

	public void cerca() throws JDOMException, IOException {

		if (contrText((TextField) root.getChildren().get(2))) {

			String word = ((TextField) root.getChildren().get(2)).getText();

			URL f = new URL("http://services.aonaware.com/DictService/DictService.asmx/Define?word=" + word);

			SAXBuilder builder = new SAXBuilder();
			Document document = (Document) builder.build(f); // Creo il
			// documento
			// System.out.println(document.toString());

			Element rootNode = document.getRootElement(); // Recupero l'elemento
			// del nodo root
			Namespace ns = Namespace.getNamespace("http://services.aonaware.com/webservices/");
			Element e = rootNode.getChild("Word", ns);
			
			((TextArea) root.getChildren().get(5)).clear();
			
			for (int i = 0; i < rootNode.getChild("Definitions", ns).getChildren("Definition", ns).size(); i++) {
				((TextArea) root.getChildren().get(5)).appendText(rootNode.getChild("Definitions", ns)
						.getChildren("Definition", ns).get(i).getChildText("WordDefinition", ns));
			}
			
			if(((TextArea) root.getChildren().get(5)).getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Term not found", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void tornaMenu() throws Exception {
		MainP m = new MainP();
		m.start(stage);
	}

	private boolean contrText(TextField t) {
		if (t.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Non possono essere lasciati campi vuoti", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else if (t.getText().indexOf(" ") != -1 || t.getText().indexOf("_") != -1) {
			JOptionPane.showMessageDialog(null, "Non possono essere presenti spazzi", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
}
