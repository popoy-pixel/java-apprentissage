package java2;

public class Livre {
    private String titre;
    private String auteur;
    private String annéepubli;

    public Livre(String titre, String auteur, String annéepubli){
        this.titre=titre;
        this.auteur=auteur;
        this.annéepubli=annéepubli;
    }
    
    public String getTitre(){
        return titre;
    }

    public String getAuteur(){
        return auteur;
    }

    public String getAnnee(){
        return annéepubli;
    }

    public void setTitre(String titre) {
    this.titre = titre;
}


   

    public void setAuteur(){
        this.auteur=auteur;
    }

    public void setAnnee(){
        this.annéepubli=annéepubli;
    }

    void afficherInfos(){
        System.out.println("Titre " + titre + "auteur " + auteur + "annéepubli" + annéepubli);

    }

}
