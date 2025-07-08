package java2;

public class Film {
    private String titre;
    private String realisateur;
    private int anneeSortie;

    public Film(String titre, String realisateur, int anneeSortie){
        this.titre=titre;
        this.realisateur=realisateur;
        this.anneeSortie=anneeSortie;
    }

    public String getTitre(){
        return titre;
    }

    public String getRealisateur(){
        return realisateur;
    }

    public int getAnnee(){
        return anneeSortie;
    }

    public void setTitre(String titre){
        if (titre == null|titre.equals("")) {
            this.titre="Titre inconnu";
        }
        
        this.titre=titre;
    }

    public void setRealisateur(String realisateur){
        this.realisateur=realisateur;
    }

    public void setAnneSortie(int anneeSortie){
        if (anneeSortie>=1888){
            this.anneeSortie=anneeSortie;
        }
        else if (anneeSortie<1888) {
            System.out.println("Titre inférieur " + "Titre" + titre + "Realisateur" + realisateur + "Annee Sortie" + anneeSortie);
            this.anneeSortie=1888;
        } 
    
    }

    public void AlerteInfos(){
        System.out.println("Titre" + titre + "Realisateur" + realisateur + "Annee Sortie" + anneeSortie );
    }
}
