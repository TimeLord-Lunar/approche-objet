package TPS_AutonomieJ6.recensement;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AfficherTop10Departements extends MenuService
{
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        // Creation of a map to store the population by department
        Map<String, Integer> populationParDepartement = new HashMap<>();

        for (Ville ville : recensement.getVilles())
        {
            String codeDepartement = ville.getCodeDepartement().trim();
            int population = ville.getPopulationTotale();
            populationParDepartement.put(codeDepartement, populationParDepartement.getOrDefault(codeDepartement, 0) + population);
        }

        // Sort departments by decreasing population
        List<Map.Entry<String, Integer>> departementsTries = new ArrayList<>(populationParDepartement.entrySet());
        departementsTries.sort((d1, d2) -> d2.getValue().compareTo(d1.getValue()));

        // Display top 10
        System.out.println("\nTOP 10 des départements les plus peuplés :");
        System.out.println("------------------------------------------");
        System.out.printf("%-5s | %-15s | %-10s%n", "Rang", "Département", "Population");
        System.out.println("------------------------------------------");

        int rank = 1;
        for (Map.Entry<String, Integer> entry : departementsTries.subList(0, Math.min(10, departementsTries.size())))
        {
            System.out.printf("%-5d | %-15s | %,-10d%n", rank, entry.getKey(), entry.getValue());
            rank++;
        }
    }
}