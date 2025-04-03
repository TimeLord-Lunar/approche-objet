package TPS_Cours.TP13.maps.Exo1;

import java.util.HashMap;
import java.util.Map;

public class CreationMap
{
    public static void main(String[] args)
    {
        // // // EXERCICE 1 // // //

        // Creating the HashMap to store salaries
        Map<String, Integer> mapSalaires = new HashMap<>();

        // Adding employees and their salaries
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        // Displaying the map size
        System.out.println("Taille de la map : " + mapSalaires.size());
    }
}
