import java.util.Scanner;

public class leconmethode{
    public static boolean estPair(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static boolean estPremier(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Triangle(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main (String[] args){
        System.out.println("Bienvenue dans le menu java");
        System.out.println("");
        System.out.println("1. Vérifier si un nombre est pair");
        System.out.println("2. Vérifier si un nombre est premier");
        System.out.println("3. Afficher un triangle d'étoiles");
        System.out.println("4. Quitter\n");
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do { 
            System.out.println("Choisissez une option : ");
            nombre = scanner.nextInt();
            if(nombre == 4)
                System.exit(0);
            System.out.println("Entrez un nombre: ");
            int nombre2 = scanner.nextInt();
            if (nombre==1){
                if (estPair(nombre2)){
                    System.out.println("Le nombre est pair");
                }
                else{
                    System.out.println("le nombre n'est pas pair");
                }
            }
            if (nombre==2){
                if (estPremier(nombre2)){
                    System.out.println("Le nombre est premier");
                }
                else{
                    System.err.println("Ce n'est pas premier");
                }
            }
            if (nombre==3){
                Triangle(nombre2);
            }

        } while (nombre != 4);
        
        
        scanner.close();

    }

}