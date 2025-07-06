package java2;

public class Main3 {
    public static void main(String[] args){
        Livre[] livre = new Livre[3];
        
        livre[0]=new Livre("mamama","tatata","odldd");

        livre[1]=new Livre("kdkdkdkdl","jdjdkdk","ldpdp^d^pd");

        livre[2]=new Livre("ksskss","dpdpdpdp","ncncncnc");

        for (int i = 0; i < livre.length; i++) {
            livre[i].afficherInfos();
        }


    }
    
}
