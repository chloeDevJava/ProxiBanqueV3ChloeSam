package org.formation.testjax;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.formation.entity.Client;

public class MarshallClient {

	public static void main(String[] args) {
		
		Client client = new Client("Leponge", "Bob", "boby@gmail.com");	
		
		JAXBContext jbc;
		try {
			jbc = JAXBContext.newInstance(Client.class);
			Marshaller marshaller = jbc.createMarshaller();
			// marshaller l'objet sur la console
			marshaller.marshal(client, System.out);
			
			//marshaller l'objet dans un fichier : on transforme un objet en XML
			marshaller.marshal(client, new File("person.xml"));

			// améliorer la visibilité du fichier
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			//marshaller l'objet dans un fichier : on transforme un objet en XML
			marshaller.marshal(client, new File("person2.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		 
		
	}
	
}
