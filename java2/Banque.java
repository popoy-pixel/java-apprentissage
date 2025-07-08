package java2;

public class Banque {
    private String titulaire;
    private double solde;


    public Banque(String titulaire ,double solde){
        this.titulaire=titulaire;
        this.solde=solde;
    }

    public String getTitulaire(){
        return titulaire;
    }

    public double getSolde(){
        return solde;
    }
    
    void deposer(double montant){
        solde=solde+montant;

        System.out.println("Solde deposer " + solde);
    }

    void retirer(double montant){
        if (solde-montant<0){
            System.out.println("error");
        }
        else{
            solde=solde-montant;
            System.out.println("Solde retirer " + solde);
        }
    }

    void AfficherInfos(){
        System.out.println("titulaire " + titulaire + " solde " + solde);
    }

    void setTitulaire(){
        if (titulaire==null|titulaire.equals("")){
            this.titulaire="titulaire inconnu";
        }
    }

}
