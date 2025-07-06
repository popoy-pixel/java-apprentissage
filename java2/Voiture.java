package java2;

 public class Voiture{

    String marque;
    String modele;
    String annee;

    public Voiture (String marque , String modele, String annee){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
    }


    void klaxonner(){
        System.out.println("bip bip !");
    }

    void afficherInfos(){
        System.out.println("Marque " + marque + " Modele " + modele + " Annee " + annee);
    }

 }