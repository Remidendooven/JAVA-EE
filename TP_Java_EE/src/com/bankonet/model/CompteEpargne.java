package com.bankonet.model;

public class CompteEpargne extends Compte {
    private float tauxInteret;

    private float plafond;

    
    public CompteEpargne(int id, String libelle, float solde,
            float tauxInteret, float plafond) {
        super(id, libelle, solde);
        this.tauxInteret = tauxInteret;
        this.plafond = plafond;
    }

    
    public boolean creditAutorise(float montant) throws BankonetException {
        if (montant < getPlafond()) {
            return true;
        } else {
            throw new BankonetException("Le compte epargne "+ this.getIdentifiant() + " a pour plafond de credit : " + this.getPlafond());
        }
    }

    public boolean debitAutorise(float montant) throws BankonetException {
        if (getSolde() - montant >= 0) {
            return true;
        } else {
            throw new BankonetException("Montant trop eleve : le solde du compte epargne "+ this.getIdentifiant() + " ne peut etre negatif" );
        }
    }



    public float getPlafond() {
        return plafond;
    }

    
    public void setPlafond(float newPlafond) {
        plafond = newPlafond;
    }

    
    public float getTauxInteret() {
        return tauxInteret;
    }

    
    public void setTauxInteret(float newTauxInteret) {
        tauxInteret = newTauxInteret;
    }
}