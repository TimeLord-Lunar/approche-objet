package TPS_AutonomieJ6.recensement;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AfficherTop10VillesRegion extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        // Ask the user for the region name
        System.out.println("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine().trim();

        // List of Villes in the given region
        List<Ville> villesDeLaRegion = new ArrayList<>();

        for (Ville ville : recensement.getVilles())
        {
            if (ville.getNomRegion().trim().equalsIgnoreCase(nomRegion))
            {
                villesDeLaRegion.add(ville);
            }
        }

        // Checking if the region exists
        if (villesDeLaRegion.isEmpty())
        {
            System.out.println("Aucune ville trouvée pour la région " + nomRegion + ".");
            return;
        }

        // Sorting Villes by decreasing population
        villesDeLaRegion.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Display top 10  villes
        System.out.println("\nTOP 10 des villes les plus peuplées de la région " + nomRegion + " :");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s | %-25s | %-10s%n", "Rang", "TPS_Cours.TP18.entites.Ville", "Population");
        System.out.println("----------------------------------------------------");

        int rank = 1;
        for (Ville ville : villesDeLaRegion.subList(0, Math.min(10, villesDeLaRegion.size())))
        {
            System.out.printf("%-5d | %-25s | %,-10d%n", rank, ville.getNomCommune(), ville.getPopulationTotale());
            rank++;
        }
    }
}
