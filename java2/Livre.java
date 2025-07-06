package java2;

public class Livre {
    String titre;
    String auteur;
    String annéepubli;

    public Livre(String titre, String auteur, String annéepubli){
        this.titre=titre;
        this.auteur=auteur;
        this.annéepubli=annéepubli;
    }

    void afficherInfos(){
        System.out.println("Titre " + titre + "auteur " + auteur + "annéepubli" + annéepubli);

    }

}
