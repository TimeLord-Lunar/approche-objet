package TPS_AutonomieJ6.recensement;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AfficherTop10VillesDepartement extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        // Request the department code from the user
        System.out.println("Entrez le code du département : ");
        String codeDepartement = scanner.nextLine().trim();

        // List of Villes in the given department
        List<Ville> villesDuDepartement = new ArrayList<>();

        for (Ville ville : recensement.getVilles())
        {
            if (ville.getCodeDepartement().trim().equalsIgnoreCase(codeDepartement)) {
                villesDuDepartement.add(ville);
            }
        }

        // Check if the department exists
        if (villesDuDepartement.isEmpty())
        {
            System.out.println("Aucune ville trouvée pour le département " + codeDepartement + ".");
            return;
        }

        // Sorting cities by decreasing population
        villesDuDepartement.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Display top 10 Villes
        System.out.println("\nTOP 10 des villes les plus peuplées du département " + codeDepartement + " :");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s | %-25s | %-10s%n", "Rang", "TPS_Cours.TP18.entites.Ville", "Population");
        System.out.println("----------------------------------------------------");

        int rank = 1;
        for (Ville ville : villesDuDepartement.subList(0, Math.min(10, villesDuDepartement.size())))
        {
            System.out.printf("%-5d | %-25s | %,-10d%n", rank, ville.getNomCommune(), ville.getPopulationTotale());
            rank++;
        }
    }
}
