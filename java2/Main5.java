package java2;


public class Main5 {
    public static void main(String[] args) {

        Banque banque = new Banque("",1000);

        banque.getTitulaire();
        banque.getSolde();

        banque.deposer(34);

        banque.retirer(23);

        banque.AfficherInfos();

        banque.setTitulaire();

        banque.AfficherInfos();

     





    }
}

