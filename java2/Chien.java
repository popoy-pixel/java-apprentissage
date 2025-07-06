package java2;

public class Chien {
    String nom;
    int age;

    void aboyer() {
        System.out.println(nom + " aboie : Wouf !");
    }

    void afficherInfos() {
        System.out.println("Nom : " + nom + ", Âge : " + age + " an(s)");
    }
}

