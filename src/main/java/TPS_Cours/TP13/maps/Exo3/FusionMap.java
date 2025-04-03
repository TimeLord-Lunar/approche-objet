package TPS_Cours.TP13.maps.Exo3;

import java.util.HashMap;
import java.util.Map;

public class FusionMap
{
    public static void main(String args[])
    {
        // // // EXERCICE 3 // // //

        // Creating map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Creating map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        // Creation of map3 and merge of map1 and map2
        HashMap<Integer, String> map3 = new HashMap<>();
        map3.putAll(map1); // merge map1
        map3.putAll(map2); // merge map2

        // Displaying map3 contents
        for (Map.Entry<Integer, String> entry : map3.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
