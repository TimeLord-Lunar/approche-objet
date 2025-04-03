package TPS_Cours.TP14.fichier;

import java.io.*;

public class CreerFichier
{
    public static void main(String[] args)
    {
        String fichierSource = "src/main/resources/TP14/recensement.csv";
        String fichierDestination = "src/main/resources/TP14/recensement_100_lignes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fichierSource));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fichierDestination)))
        {

            String ligne;
            int compteur = 0;

            while ((ligne = br.readLine()) != null && compteur < 100)
            {
                bw.write(ligne);
                bw.newLine();
                compteur++;
            }

            System.out.println("Extraction réussie : 100 premières lignes enregistrées dans " + fichierDestination);

        } catch (IOException e)
        {
            System.err.println("Erreur lors du traitement du fichier : " + e.getMessage());
        }
    }
}
