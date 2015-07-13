package com.bankonet.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Client {
	private int identifiant;
	private String nom;
	
	public void setCompteCourantList(List compteCourantList) {
		this.compteCourantList = compteCourantList;
	}
	
	public void setCompteEpargneList(List compteEpargneList) {
		this.compteEpargneList = compteEpargneList;
	}
	private String prenom;
	private List compteCourantList;
	private List compteEpargneList;


	
	public Client(int identifiant, String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}


	
	public List getCompteCourantList() {
		return Collections.unmodifiableList(compteCourantList);
	}
	
	public List getCompteEpargneList() {
		return Collections.unmodifiableList(compteEpargneList);
	}
	
	public List getComptes() {
	    List compteList = new ArrayList();
	    compteList.addAll(compteCourantList);
	    compteList.addAll(compteEpargneList);
	    return Collections.unmodifiableList(compteList);

	}

	public Compte getCompte(int compteId) {
	    List compteList = this.getComptes();
	    Iterator compteIte = compteList.iterator();
	    while (compteIte.hasNext()) {
            Compte compte = (Compte) compteIte.next();
            if (compteId == compte.getIdentifiant())
                return compte;
        }
	    return null; 
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
}
