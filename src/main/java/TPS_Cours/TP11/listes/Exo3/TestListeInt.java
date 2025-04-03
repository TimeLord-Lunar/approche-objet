package TPS_Cours.TP11.listes.Exo3;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt
{
    public static void main(String[] args)
    {
        // // // EXERCICE 3 // // //

        // Create and Initialization List
        List<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        // Display Elements from List
        System.out.println("Liste initiale : " + liste);

        // Display List Size
        System.out.println("Taille de la liste : " + liste.size());

        // Looking for Biggest Elements and Display it
        int max = liste.get(0);

        for (int nombre : liste)
        {
            if (nombre > max)
            {
                max = nombre;
            }
        }
        System.out.println("Plus grand élément : " + max);

        // Looking for Smallest Elements and Delete it
        int min = liste.get(0);

        for (int nombre : liste)
        {
            if (nombre < min)
            {
                min = nombre;
            }
        }
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément (" + min + ") : " + liste);

        // Convert Negatives number with their absolute value
        for (int i = 0; i < liste.size(); i++)
        {
            if (liste.get(i) < 0)
            {
                liste.set(i, -liste.get(i));
            }
        }

        // Display List after Everything
        System.out.println("Liste après conversion des négatifs en positifs : " + liste);
    }
}
