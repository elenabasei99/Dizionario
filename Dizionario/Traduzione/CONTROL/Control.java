package CONTROL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import MAIN.MainP;
import MAIN.mainT;
import MODEL.Gestione;
import VIEW.Finestra;
import generated.Translation;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Control implements Initializable {
	private Stage stage;
	private AnchorPane root;
	private ComboBox<String> comboBox1 = new ComboBox<String>();
	private ComboBox<String> comboBox2 = new ComboBox<String>();
	private static final String voiceName = "kevin16";

	public void setRoot(Stage stage, AnchorPane root) {
		this.stage = stage;
		this.root = root;

		comboBox1.setItems(getLista());
		comboBox1.setPrefWidth(150);
		comboBox1.setPrefHeight(25);
		comboBox1.setLayoutX(265);
		comboBox1.setLayoutY(144);

		comboBox2.setPrefWidth(150);
		comboBox2.setPrefHeight(25);
		comboBox2.setLayoutX(265);
		comboBox2.setLayoutY(185);

		comboBox1.setOnAction((event) -> {
			int selected = comboBox1.getSelectionModel().getSelectedIndex();
			comboBox2.setItems(getLista(selected));
		});
		root.getChildren().add(comboBox1);
		root.getChildren().add(comboBox2);

	}

	private ObservableList<String> getLista() {
		ObservableList<String> list = FXCollections.observableArrayList("Italiano", "Inglese", "Francese", "Tedesco",
				"Russo");
		return list;
	}

	private ObservableList<String> getLista(int selected) {

		ObservableList<String> list = FXCollections.observableArrayList();
		switch (selected) {
		case 0:
			list.add("Inglese");
			list.add("Francese");
			list.add("Tedesco");
			list.add("Russo");
			break;
		case 1:
			list.add("Italiano");
			list.add("Francese");
			list.add("Tedesco");
			list.add("Russo");
			break;
		case 2:
			list.add("Italiano");
			list.add("Inglese");
			list.add("Tedesco");
			list.add("Russo");
			break;
		case 3:
			list.add("Italiano");
			list.add("Inglese");
			list.add("Francese");
			list.add("Russo");
			break;
		case 4:
			list.add("Italiano");
			list.add("Inglese");
			list.add("Francese");
			list.add("Tedesco");
			break;
		default:
			break;
		}
		return list;
	}

	public void traduci() throws MalformedURLException, JAXBException {
		if (contrText((TextField) root.getChildren().get(5)) && contrCombo()) {

			String l1 = getLingua(comboBox1);
			String l2 = getLingua(comboBox2);
			String parola = ((TextField) root.getChildren().get(5)).getText();

			URL url = new URL(
					"https://translate.yandex.net/api/v1.5/tr/translate?key=trnsl.1.1.20171212T105937Z.064bd563238b831f.cc0e13f6cf93f48630c839bedb85b3ff7d8dfcc7&text="
							+ parola + "&lang=" + l1 + "-" + l2);
			JAXBContext jaxbContext = JAXBContext.newInstance(Translation.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Translation t = (Translation) jaxbUnmarshaller.unmarshal(url);

			((TextField) root.getChildren().get(6)).setText(t.getText());
		}
	}

	public void tornaMenu() throws Exception {
		MainP m = new MainP();
		m.start(stage);
	}

	public void suono() {
		Voice voice;
		VoiceManager vm = VoiceManager.getInstance();
		voice=vm.getVoice(voiceName);
		
		voice.allocate();
		
		try {
			voice.speak(((TextField) root.getChildren().get(6)).getText());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
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

	private boolean contrCombo() {
		if (comboBox1.getSelectionModel().getSelectedIndex() == -1
				|| comboBox2.getSelectionModel().getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Devi selezionare le lingue", "ERROR", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	private String getLingua(ComboBox<String> c) {
		String s = (String) c.getSelectionModel().getSelectedItem();

		if (s.equals("Italiano"))
			return "it";
		else if (s.equals("Inglese"))
			return "en";
		else if (s.equals("Francese"))
			return "fr";
		else if (s.equals("Tedesco"))
			return "de";
		else if (s.equals("Russo"))
			return "ru";
		else
			return null;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
}
