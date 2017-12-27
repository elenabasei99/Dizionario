package CONTROL;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import MAIN.mainT;
import VIEW.Finestra;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlIntro implements Initializable{
	
	private Stage root;
	
	private Button btnTraduttore;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void showTraduttore(ActionEvent event) throws Exception {
		mainT m=new mainT();
		m.start(root);
	}
	
	public void showDictionary(ActionEvent event) {
		root.close();
	}
	
	public void setRoot(Stage root) {
		this.root = root;
	}
	
	
}
