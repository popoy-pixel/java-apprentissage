package java2;

public class Main4 {
    public static void main(String[] args){
        Film film1 = new Film("Interstellar","Tarentino",1999);
        Film film2 = new Film("","Tarentino",1800);

        film2.setTitre("yuyuy");
        film2.setAnneSortie(1300);

        film2.AlerteInfos();

    }
    
}
