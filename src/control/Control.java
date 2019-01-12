package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelBdd.Exterieur;
import modelBdd.Lieu;
import modelBdd.Scene;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


public class Control {

	public Control() {
		// TODO Auto-generated constructor stub
	}

	public void testingRun() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hybernate_factory");
		EntityManager em = emf.createEntityManager();
		
		Exterieur e1 = new Exterieur();
		e1.setId(1337);
		e1.setTexte("banan");
		e1.setCodeLieu(25);
		
		Lieu e2 = new Lieu();
		e2.setCodeAir(22);
		e2.setEndroit("A86");
		e2.setDescription("jpp");
		
		em.getTransaction().begin();
		em.persist(e2);
		em.persist(e1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
