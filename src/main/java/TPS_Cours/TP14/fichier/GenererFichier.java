package TPS_Cours.TP14.fichier;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenererFichier
{
    public static void main(String[] args) {
        String cheminFichierEntree = "src/main/resources/TP14/recensement.csv";
        String cheminFichierSortie = "src/main/resources/TP14/villes_25000.csv";

        // Creation of List
        List<Ville> villes = new ArrayList<>();

        // Reading and storing
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichierEntree)))
        {
            String ligne;

            //  Ignore the first line (header)
            boolean premier = true;

            while ((ligne = br.readLine()) != null)
            {
                if (premier)
                {
                    premier = false;
                    continue;
                }

                String[] tokens = ligne.split(";");
                if (tokens.length >= 10)
                {
                    // Check that the necessary columns are present.
                    try
                    {
                        String nom = tokens[0].trim();
                        String codeDepartement = tokens[1].trim();
                        String nomRegion = tokens[2].trim();
                        int populationTotale = Integer.parseInt(tokens[9].replace(" ", "").trim());

                        Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                        if (populationTotale > 25000)
                        {
                            villes.add(ville);
                        }
                    } catch (NumberFormatException e)
                    {
                        System.err.println("Erreur conversion population pour : " + ligne);
                    }
                }
            }

            System.out.println("Nombre de villes filtrées : " + villes.size());

        } catch (IOException e)
        {
            System.err.println("Erreur lecture fichier : " + e.getMessage());
        }

        // Writing the filtered file WITHOUT header line
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(cheminFichierSortie)))
        {
            for (Ville ville : villes)
            {
                bw.write(ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale());
                bw.newLine();
            }

            System.out.println("Fichier généré sans ligne d'entête : " + cheminFichierSortie);

        } catch (IOException e)
        {
            System.err.println("Erreur écriture fichier : " + e.getMessage());
        }
    }
}
