package java2;

public class Main2 {
    public static void main(String[] args){
        Voiture[] voiture = new Voiture[3];

        voiture[0] = new Voiture("19", "Renault","V1"); 
        
        voiture[1]= new Voiture("21","V5","BB");

        voiture[2]=new Voiture("45","HHDHDH","hdfhdkd;k");


        for (int i = 0; i < voiture.length; i++) {
            voiture[i].afficherInfos();
            voiture[i].klaxonner();
            
        }


    }
    
}
