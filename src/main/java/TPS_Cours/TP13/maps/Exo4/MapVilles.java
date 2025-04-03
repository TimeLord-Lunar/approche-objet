package TPS_Cours.TP13.maps.Exo4;

import java.util.HashMap;
import java.util.Map;

public class MapVilles
{
    public static void main(String[] args)
    {
        // // // EXERCICE 4 // // //

        // Creation of the map
        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        // Search for the Ville with the fewest habitants
        String villeMoinsPeuplee = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Map.Entry<String, Ville> entry : mapVilles.entrySet())
        {
            if (entry.getValue().getNbHabitants() < minHabitants)
            {
                minHabitants = entry.getValue().getNbHabitants();
                villeMoinsPeuplee = entry.getKey();
            }
        }

        // Removal of the Ville with the fewest habitants
        if (villeMoinsPeuplee != null)
        {
            mapVilles.remove(villeMoinsPeuplee);
        }

        // Showing remaining Ville
        for (Ville ville : mapVilles.values())
        {
            System.out.println(ville);
        }
    }
}
