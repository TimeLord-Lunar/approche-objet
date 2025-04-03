package TPS_Cours.TP14.fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier
{
    public static void main(String[] args)
    {
        String cheminFichier = "src/main/resources/TP14/recensement.csv";

        // Reading Files
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier)))
        {
            String ligne;
            while ((ligne = br.readLine()) != null)
            {
                System.out.println(ligne);
            }
        } catch (IOException e)
        {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
