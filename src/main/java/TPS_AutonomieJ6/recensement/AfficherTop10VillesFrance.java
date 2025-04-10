package TPS_AutonomieJ6.recensement;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AfficherTop10VillesFrance extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        // Copy of the list of Villes
        List<Ville> villesDeFrance = new ArrayList<>(recensement.getVilles());

        // Checking if Ville exist
        if (villesDeFrance.isEmpty())
        {
            System.out.println("Aucune donnée de ville disponible.");
            return;
        }

        // Sorting Villes by decreasing population
        villesDeFrance.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Display top 10 villes
        System.out.println("\nTOP 10 des villes les plus peuplées de France :");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s | %-25s | %-10s%n", "Rang", "TPS_Cours.TP18.entites.Ville", "Population");
        System.out.println("----------------------------------------------------");

        int rank = 1;
        for (Ville ville : villesDeFrance.subList(0, Math.min(10, villesDeFrance.size())))
        {
            System.out.printf("%-5d | %-25s | %,-10d%n", rank, ville.getNomCommune(), ville.getPopulationTotale());
            rank++;
        }
    }
}
