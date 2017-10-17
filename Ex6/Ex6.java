package Ex6;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Scanner;



public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez l'URL de l'image");
        String URL = sc.nextLine();

        try {

            BufferedImage imgURL = ImageIO.read(new URL(URL)); //Va récupérer l'image en suivant l'URL
            ImageIO.write(imgURL, "jpg", new File("./Fichiers/Ex6/" + ".jpg"));
            //Écrit l'image dans le dossier donné et ajoute l'extension "jpg"
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}