package TPS_Cours.TP13.maps.Exo2;

import java.util.HashMap;

public class CreationEtManipulationMap
{
    public static void main(String args[])
    {
        // // // EXERCICE 2 // // //

        // Creation of the HashMap to store City
        HashMap<Integer, String> mapVilles = new HashMap<>();

        // Adding initial cities
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Added new cities
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Display of keys (department numbers)
        System.out.println("Numéros des départements :");
        for (Integer key : mapVilles.keySet())
        {
            System.out.println(key);
        }

        // Displaying values (city names)
        System.out.println("\nNoms des villes :");
        for (String value : mapVilles.values())
        {
            System.out.println(value);
        }

        // Display the map size
        System.out.println("\nTaille de la map : " + mapVilles.size());
    }
}
