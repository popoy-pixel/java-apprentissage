package java2;

public class Film2 {
    String titre;
    String realisateur;
    int annee;

    public Film2(String titre, String realisateur, int annee){
        this.titre=titre;
        this.realisateur=realisateur;
        this.annee=annee;
    }

    void afficherInfos(){
        System.out.println("Titre " + titre + " realisateur "+ realisateur + " annee " + annee);
    }
    
}
