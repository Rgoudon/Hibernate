package control;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelBdd.Clap;
import modelBdd.Exterieur;
import modelBdd.Film;
import modelBdd.Interieur;
import modelBdd.Setup;

public class Choix {


	public Choix() {
		// TODO Auto-generated constructor stub
	}

	public void running() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oui");
		EntityManager em = emf.createEntityManager();
		/*
		Exterieur e = new Exterieur();
		e.setCodeLieu(entier);
		e.setTexte(texte);
	
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		*/
		em.close();
		emf.close();
		
	}
	
	public void initBdd() {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oui");
		EntityManager em = emf.createEntityManager();
		
		Film film1= new Film();
		
		Exterieur scene1 = new Exterieur();
		Interieur scene2 = new Interieur();
		
		Setup set1 = new Setup();
		Setup set2 = new Setup();
		
		Clap clap11 = new Clap();
		Clap clap21 = new Clap();
		
		Clap clap12 = new Clap();
		Clap clap22 = new Clap();
		
		film1.setTitre("banane");
		
		scene1.setTexte("texte");
		scene2.setTexte("texte_scene2");

		set1.setTexte("description");
		set2.setTexte("description set2");
		
		clap11.setCodeBobine(18);
		clap11.setDuree(18);
		clap21.setCodeBobine(19);
		clap21.setDuree(19);
		
		clap12.setCodeBobine(28);
		clap12.setDuree(48);
		clap22.setCodeBobine(69);
		clap22.setDuree(79);
		
		
		/*em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		*/
		em.close();
		emf.close();
		
	}
	
	
}
