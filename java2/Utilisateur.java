package java2;

public class Utilisateur {
    String nom;
    String prenom;
    String email;
    public Utilisateur(){
        nom="personne";
        prenom="personne2";
        email="miaou miaou";
    }

    public Utilisateur(String nom, String prenom, String email){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
    }

    void AfficherInfos(){
        System.out.println("nom " + nom + "prenom" + prenom + "email" + email);
    }
}
