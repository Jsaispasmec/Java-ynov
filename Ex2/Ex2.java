import java.io.File;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un chemin d'accès");
        String chemin = sc.nextLine();


        String[] files = new java.io.File(chemin).list();
        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);//marque les fichiers trouvés
        }


    }


}
