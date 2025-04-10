package TPS_AutonomieJ6.recensement;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AfficherTop10Regions extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        // Creating a map to store population by region
        Map<String, Integer> populationParRegion = new HashMap<>();

        for (Ville ville : recensement.getVilles())
        {
            String nomRegion = ville.getNomRegion().trim();
            int population = ville.getPopulationTotale();
            populationParRegion.put(nomRegion, populationParRegion.getOrDefault(nomRegion, 0) + population);
        }

        // Sort regions by decreasing population
        List<Map.Entry<String, Integer>> regionsTriees = new ArrayList<>(populationParRegion.entrySet());
        regionsTriees.sort((r1, r2) -> r2.getValue().compareTo(r1.getValue()));

        // Display top 10
        System.out.println("\nTOP 10 des régions les plus peuplées :");
        System.out.println("---------------------------------------");
        System.out.printf("%-5s | %-30s | %-10s%n", "Rang", "Région", "Population");
        System.out.println("---------------------------------------");

        int rank = 1;
        for (Map.Entry<String, Integer> entry : regionsTriees.subList(0, Math.min(10, regionsTriees.size())))
        {
            System.out.printf("%-5d | %-30s | %,-10d%n", rank, entry.getKey(), entry.getValue());
            rank++;
        }
    }
}
