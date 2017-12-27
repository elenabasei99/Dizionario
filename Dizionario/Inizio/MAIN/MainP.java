package MAIN;

import CONTROL.ControlIntro;
import VIEW.Finestra;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainP extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			AnchorPane root=null;
			
			ControlIntro c=new ControlIntro();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/VIEW/FinestraIntro.fxml"));
			fxmlLoader.setRoot(root);
			fxmlLoader.setController(c);
			root=fxmlLoader.load();
			
			c.setRoot(primaryStage);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/VIEW/setting.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
