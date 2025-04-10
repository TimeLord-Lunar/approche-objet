package TPS_AutonomieJ6.recensement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Recensement
{
    private String cheminFichierEntree = "src/main/resources/TP14/recensement.csv";
    private List<Ville> villes;

    // Constructor
    public Recensement()
    {
        this.villes = new ArrayList<>();

        // Reading and storing Villes
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichierEntree)))
        {
            String ligne;
            boolean premier = true;

            while ((ligne = br.readLine()) != null)
            {
                // Allows you to ignore the first line (header)
                if (premier)
                {
                    premier = false;
                    continue;
                }

                String[] tokens = ligne.split(";");
                if (tokens.length >= 10)
                {
                    // Check that the necessary columns are present
                    try
                    {
                        String codeRegion = tokens[0].trim();
                        String nomRegion = tokens[1].trim();
                        String codeDepartement = tokens[2].trim();
                        String codeCommune = tokens[5].trim();
                        String nomCommune = tokens[6].trim();
                        String nom = tokens[0].trim();

                        int populationTotale = Integer.parseInt(tokens[9].replace(" ", "").trim());

                        Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

                        villes.add(ville);
                        System.out.println("TPS_Cours.TP18.entites.Region : " + ville.getCodeRegion() +
                                " Nom Région : " + ville.getNomRegion() +
                                " Code Département : " + codeDepartement + ".");

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
    }

    public Recensement(List<Ville> villes)
    {
        this.villes = villes;
    }

    // Getter Villes
    public List<Ville> getVilles()
    {
        return villes;
    }

    // Setter Ville
    public void setVilles(List<Ville> villes)
    {
        this.villes = villes;
    }
}
