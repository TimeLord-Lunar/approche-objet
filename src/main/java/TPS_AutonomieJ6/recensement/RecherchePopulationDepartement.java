package TPS_AutonomieJ6.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        System.out.println("Entrez le code du département : ");
        String codeDepartement = scanner.nextLine().trim();

        int populationTotale = 0;
        int countVilles = 0;

        for (Ville v : recensement.getVilles())
        {
            if (v.getCodeDepartement().trim().equalsIgnoreCase(codeDepartement))
            {
                populationTotale += v.getPopulationTotale();
                countVilles++;
            }
        }

        if (countVilles == 0)
        {
            System.out.println("Aucune ville trouvée pour le département " + codeDepartement + ".");
        } else
        {
            System.out.println("Nombre de villes trouvées : " + countVilles);
            System.out.println("Population du département " + codeDepartement + " : " + populationTotale);
        }
    }
}
