package java2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Film2> film = new ArrayList<>();
        
        film.add(new Film2("Interstellar", "nolan", 2019));
        film.add(new Film2("John Wick", "Wao", 2029));
        
        int nb;

        do { 
            System.out.println("1- Ajouter un film");
            System.out.println("2- Lister les films");
            System.out.println("Quitter");

            nb = scanner.nextInt();
            scanner.nextLine();

            if(nb==3){
                System.exit(0);
            }

            if(nb==2){
                System.out.println("Lister les films");
                for (Film2 films : film) {
                    films.afficherInfos();
                    
                }
            }
            if(nb==1){
                System.out.println("Ajouter titre");
                String titre = scanner.nextLine();
                
                System.out.println("Ajouter realisateur");
                String realisateur = scanner.nextLine();

                System.out.println("Ajouter année");
                int annee = scanner.nextInt();

                film.add(new Film2(titre, realisateur, annee));

                
            }

            
        } while (nb!=3);

   
    }

    }


