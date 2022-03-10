import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Le chmemin vers le fichier txt//
        String cheminTxt = "C://Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/sauvegarde/cberthier.txt";

        // Le chmemin vers la page html à modifier
        File HtmlFile = new File("C://Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/SiteWeb/cberthier.html");

        String nom = Files.readAllLines(Paths.get(cheminTxt)).get(0);
        String prenom = Files.readAllLines(Paths.get(cheminTxt)).get(1);
        String Fonction = Files.readAllLines(Paths.get(cheminTxt)).get(2);
        // String password = Files.readAllLines(Paths.get(cheminTxt)).get(3);
        // Files.readAllLines(Paths.get("C://Users/PANGNON/Documents/sauvegarde/cberthier.txt")).get(3);
        String vide = Files.readAllLines(Paths.get(cheminTxt)).get(4);
        String outil1 = Files.readAllLines(Paths.get(cheminTxt)).get(5);
        String outil2 = Files.readAllLines(Paths.get(cheminTxt)).get(6);
        String outil3 = Files.readAllLines(Paths.get(cheminTxt)).get(7);
        // String outil3 = Files.readAllLines(Paths.get(cheminTxt)).get(0);

        /*
         * -----Tester la reupéeration des informmations stocker dans les variables pour
         * les afficher dans la consoles----
         */
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(Fonction);

        System.out.println(vide);
        // System.out.println(kit);
        System.out.println(outil1);
        System.out.println(outil2);
        System.out.println(outil3);
        System.out.println(vide);
        /*
         * -----------------------------------------------------------------------------
         * ----------------------
         */

        if (!HtmlFile.exists()) {

            try {
                HtmlFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            List<String> htmlLines = Arrays.asList("<!DOCTYPE html> <html>" +
                    "<head>" +
                    "<meta charset='utf-8' />" +
                    "<link rel='stylesheet' href='style.css' />" +
                    " <title>Go Securi</title>" +
                    " </head>" +

                    " <body> " +
                    " <div id='identification'>" +
                    "<p>Corinne Berthier</p>" +
                    "</div> " +

                    " <div id='icones'>" +
                    " <img src='C:/Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/SiteWeb/images/CorinneBerthierID.jpg' alt='ID' class='imageIcone'>"
                    +
                    "  </div>  " +

                    "<div id='equipement'>" +
                    " <p>" + outil1
                    + " <img src='C:/Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/SiteWeb/images/coche.png' alt='coche'> </p>"
                    +
                    "<p>" + outil2
                    + " <img src='C:/Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/SiteWeb/images/coche.png' alt='coche'></p>"
                    +
                    " <p>" + outil3
                    + " <img src='C:/Users/PANGNON/Documents/Projet MSPR DevMSPR-dev/MSPR-dev/SiteWeb/images/coche.png' alt='coche'></p>"
                    +
                    " </div>" +

                    " <div id='lien_accueil'>" +
                    "  <a href='index.html'>Retour à la page d'accueil</a>" +
                    " </div>" +
                    " </body>" +
                    " </html>");

            try {
                FileWriter writer = new FileWriter(HtmlFile);
                BufferedWriter brw = new BufferedWriter(writer);
                for (String line : htmlLines) {
                    brw.write(line);
                    brw.newLine();
                    System.out.println(line);
                    brw.close();
                    writer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
