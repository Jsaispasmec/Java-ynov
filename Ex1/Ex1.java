import java.io.File;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un chemin d'accès");
        String chemin = sc.nextLine();//Scanne ce qu'on écrit

        File f = new File(chemin);
        if(f.exists()){ //permet de savoir si il existe
            if(f.isDirectory()) { //permet de savoir si c'est un dossier
                System.out.println("C'est un dossier");
        }
                else if(f.isFile()){ //permet de savoir si c'est un fichier
                    System.out.println("C'est un fichier");
        }
        }
            else{
                System.out.println("Le fichier n'existe pas");
        }
    }
}