package java2;

public class Main {
    public static void main(String[] args) {
        Chien[] chien = new Chien[3];

        chien[0] =new Chien();
        chien[0].nom="Rex";
        chien[0].age=12;

        chien[1]=new Chien();
        chien[1].nom="Milou";
        chien[1].age=18;

        chien[2]=new Chien();
        chien[2].nom="Scooby";
        chien[2].age=19;

        for (int i = 0; i < chien.length; i++) {
            chien[i].afficherInfos();
            chien[i].aboyer();
        }


     
    }
}

