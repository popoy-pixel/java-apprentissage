import java.util.Scanner;

public class TableMultiplication {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre ");
        int nombre = scanner.nextInt();
        System.out.println("Table de" + nombre + ":" );
        
        for (int i=0;i<=10;i++){
            int resultat= nombre*i;
            System.out.println(resultat);
        }
        scanner.close();

    }
}