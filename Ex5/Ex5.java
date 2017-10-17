package Ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
            public static void main(String[] args){

                FileInputStream fis = null; //on déclare le fis
                FileOutputStream fos = null; //on déclare le fos

                try {

                    fis = new FileInputStream(new File("./Fichiers/Ex5/Test.txt"));
                    fos = new FileOutputStream(new File("./Fichiers/Ex5/Test2.txt"));

                    byte[] buf = new byte[8]; //Crée un tableau de byte qui va indiquer chaque byte lus


                    while((fis.read(buf)) >= 0) { //On sort de la boucle lorsque la lecture du fichier est terminée

                        fos.write(buf); //Écrit dans le second fichier une copie de ce qu'il y a dans le premier

                        for(byte bit : buf) {
                            System.out.print("\t" + bit + "(" + (char) bit + ")"); //Affiche le contenu du premier
                            //fichier au format byte puis et au format char
                        }
                        System.out.println("");

                        buf = new byte[8]; //Réinitialistion du buffer afin d'éviter les doublons
                    }
                    System.out.println("Le fichier a bien été copié");
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                finally { //Ferme les flux de données pour s'assurer que ces instructions s'exécutent même si
                          //l'exception est levée
                    try {
                        if (fis != null)
                            fis.close();
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                    try {
                        if (fos != null)
                            fos.close();
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
}
