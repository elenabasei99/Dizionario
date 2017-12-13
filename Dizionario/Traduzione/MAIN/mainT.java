package MAIN;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import generated.Translation;

public class mainT {

	public static void main(String[] args) throws MalformedURLException, JAXBException {
		URL f = new URL("https://translate.yandex.net/api/v1.5/tr/translate?key=trnsl.1.1.20171212T105937Z.064bd563238b831f.cc0e13f6cf93f48630c839bedb85b3ff7d8dfcc7&text=germania&lang=it-de");
		JAXBContext jaxbContext = JAXBContext.newInstance(Translation.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Translation t = (Translation) jaxbUnmarshaller.unmarshal(f);
		
		System.out.println(t.getText());
		//prova
	}

}
