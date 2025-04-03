package TPS_Cours.TP14.fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectureFichierAvecInstanciation
{
    public static void main(String[] args)
    {
        String cheminFichier = "src/main/resources/TP14/recensement.csv";
        List<Ville> villes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier)))
        {
            String ligne;

            // To ignore the header
            boolean premier = true;

            while ((ligne = br.readLine()) != null)
            {
                if (premier)
                {
                    premier = false;
                    continue;
                }

                String[] tokens = ligne.split(";");
                if (tokens.length >= 4)
                {
                    // Check that there are at least 4 columns
                    try
                    {
                        String nom = tokens[0];
                        String codeDepartement = tokens[1];
                        String nomRegion = tokens[2];
                        int populationTotale = Integer.parseInt(tokens[9].replace(" ", "").trim());

                        Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                        villes.add(ville);
                    } catch (NumberFormatException e)
                    {
                        System.err.println("Erreur de conversion de la population pour la ligne : " + ligne);
                    }
                }
            }

            // Displaying the first 10 Ville for verification
            System.out.println("Affichage des 10 premières villes :");
            for (int i = 0; i < Math.min(10, villes.size()); i++)
            {
                System.out.println(villes.get(i));
            }

            System.out.println("Nombre total de villes stockées : " + villes.size());

        } catch (IOException e)
        {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
