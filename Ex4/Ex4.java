package Ex4;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Ex4 {

    static File file = new File("./Fichiers/Ex4/Test.txt");//On donne le chemin

    public static void main(String[] args) {
        String s= "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez rentrer ce que vous désirez écrire dans le fichier");
        while(!s.equals("quit")){
            s = sc.nextLine(); //Récupère ce qu'on écrit dans le scanner
                if(!s.equals("quit")){ //Écrit dans le fichier tant qu'on écrit pas "quit"

                try(FileWriter writer = new FileWriter(file,true)) {
                    s = s + "\n";
                    writer.write(s);
                }

                catch(FileNotFoundException e){ //Lève l'exception si aucun fichier n'est trouvé
                    e.printStackTrace();
                }

                catch(IOException e){ //Se produit lorsqu'il y a une erreur de lecture ou d'écriture
                    e.printStackTrace();
                }
            }
        }

    }
}
