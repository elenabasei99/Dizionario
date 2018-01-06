package MAIN;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import CONTROL.ControlT;
import CONTROL.ControlIntro;
import VIEW.Finestra;
import generated.Translation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class mainT extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			AnchorPane root=null;
			
			ControlT c=new ControlT();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/VIEW/FinestraT.fxml"));
			fxmlLoader.setRoot(root);
			fxmlLoader.setController(c);
			root=fxmlLoader.load();
			
			c.setRoot(primaryStage, root);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/VIEW/style.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
