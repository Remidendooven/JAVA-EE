package com.bankonet.model;



public class CompteCourant extends Compte {
    private float decouvertAutorise;

    public CompteCourant(int id, String libelle, float solde,
            float decouvertAutorise) {

        super(id, libelle, solde);

        this.decouvertAutorise = decouvertAutorise;
    }

    
    public boolean creditAutorise(float montant) throws BankonetException {
        return true;
    }

    public boolean debitAutorise(float montant) throws BankonetException {
        if (this.getSolde() + this.getDecouvertAutorise() >= montant) {
            return true;
        } else {
            throw new BankonetException("Montant trop eleve : le solde du compte courant "+ this.getIdentifiant() + " ne peut descendre en dessous du decouvert autorise" );
                   }
    }

   
    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }
}