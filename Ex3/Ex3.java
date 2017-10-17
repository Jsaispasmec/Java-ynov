import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un chemin d'accès");
        String chemin = sc.nextLine();

        System.out.println("A présent donnez une extension");
        String extension = sc.nextLine();

        File f = new File(chemin);

        if (f.isDirectory()) {
            File[] files = f.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {

                    boolean result;
                    if (name.endsWith(extension))

                    {
                        result = true;
                    } else

                    {
                        result = false;
                    }
                    return result;
                }
            });
            for (File listFilesExt : files) {
                try {
                    System.out.println(listFilesExt.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
