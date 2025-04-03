package TPS_Cours.TP13.maps.Exo5;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent
{
    public static void main(String[] args)
    {
        // // // EXERCICE 5 // // //

        // Creation of the list of Pays
        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65, "Europe"));
        listePays.add(new Pays("Allemagne", 80, "Europe"));
        listePays.add(new Pays("Belgique", 10, "Europe"));
        listePays.add(new Pays("Russie", 150, "Asie"));
        listePays.add(new Pays("Chine", 1400, "Asie"));
        listePays.add(new Pays("Indonésie", 220, "Océanie"));
        listePays.add(new Pays("Australie", 20, "Océanie"));

        // Creating a HashMap for counting by Continent
        HashMap<String, Integer> comptageContinent = new HashMap<>();

        for (Pays pays : listePays)
        {
            String continent = pays.getContinent();
            comptageContinent.put(continent, comptageContinent.getOrDefault(continent, 0) + 1);
        }

        // Displaying results
        System.out.println("Nombre de pays par continent :");
        for (String continent : comptageContinent.keySet())
        {
            System.out.println(continent + " : " + comptageContinent.get(continent) + " pays");
        }
    }
}
