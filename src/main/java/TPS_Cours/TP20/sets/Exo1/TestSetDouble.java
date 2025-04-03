package TPS_Cours.TP20.sets.Exo1;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble
{
    public static void main(String[] args)
    {
        // Instantiating the HashSet with the given elements
        Set<Double> setDoubles = new HashSet<>();
        setDoubles.add(1.5);
        setDoubles.add(8.25);
        setDoubles.add(-7.32);
        setDoubles.add(13.3);
        setDoubles.add(-12.45);
        setDoubles.add(48.5);
        setDoubles.add(0.01);

        // Displaying collection elements
        System.out.println("Éléments du HashSet : " + setDoubles);

        // Finding the largest element
        double max = Double.MIN_VALUE;
        for (double num : setDoubles)
        {
            if (num > max)
            {
                max = num;
            }
        }
        System.out.println("Le plus grand élément est : " + max);

        // Finding and deleting the smallest element
        double min = Double.MAX_VALUE;
        for (double num : setDoubles)
        {
            if (num < min)
            {
                min = num;
            }
        }
        setDoubles.remove(min);
        System.out.println("Suppression du plus petit élément : " + min);

        // Displaying the HashSet after deletion
        System.out.println("Éléments après suppression : " + setDoubles);
    }
}
