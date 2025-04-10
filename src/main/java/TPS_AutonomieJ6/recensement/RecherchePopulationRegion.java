package TPS_AutonomieJ6.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        System.out.println("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine().trim();

        int populationTotale = 0;
        int countVilles = 0;

        for (Ville v : recensement.getVilles())
        {
            if (v.getNomRegion().trim().equalsIgnoreCase(nomRegion))
            {
                populationTotale += v.getPopulationTotale();
                countVilles++;
            }
        }

        if (countVilles == 0)
        {
            System.out.println("Aucune ville trouvée pour le département " + nomRegion + ".");
        } else
        {
            System.out.println("Nombre de villes trouvées : " + countVilles);
            System.out.println("Population du département " + nomRegion + " : " + populationTotale);
        }
    }
}
