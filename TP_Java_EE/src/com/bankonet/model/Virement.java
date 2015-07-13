package com.bankonet.model;


public class Virement {
    private Compte compteDestination;

    private Compte compteSource;

    private float montant;

    
    public Virement(Compte compteSource, Compte compteDestination, float montant) {
        this.compteSource = compteSource;
        this.compteDestination = compteDestination;
        this.montant = montant;
    }

    
    public Compte getCompteDestination() {
        return compteDestination;
    }

   
    public Compte getCompteSource() {
        return compteSource;
    }

    
    public float getMontant() {
        return montant;
    }
}