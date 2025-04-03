package TPS_Cours.TP12.tri.Exo1_2;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {
    public static void main(String[] args)
    {
        // Creation of the List of Ville
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // // // EXERCICE 1 // // //

//        // Manually sort the list of cities in alphabetical order (sort by selection)
//        for (int i = 0; i < villes.size() - 1; i++)
//        {
//            // Find the index of the Ville with the smallest name (alphabetical order)
//            int indexMin = i;
//            for (int j = i + 1; j < villes.size(); j++)
//            {
//                if (villes.get(j).compareTo(villes.get(indexMin)) < 0)
//                {
//                    indexMin = j;
//                }
//            }

//            // Swap the current Ville with the one at indexMin
//            Ville temp = villes.get(i);
//            villes.set(i, villes.get(indexMin));
//            villes.set(indexMin, temp);
//        }
//
//        // Displaying sorted cities
//        System.out.println("Villes triées par ordre alphabétique :");
//        for (Ville ville : villes)
//        {
//            System.out.println(ville);
//        }


        // // // EXERCICE 2 // // //

        // Sort the list by number of inhabitants by Using the compareTo method of the Ville class to sort
        villes.sort(null);

        // Displaying sorted cities
        System.out.println("Villes triées par nombre d'habitants :");
        for (Ville ville : villes)
        {
            System.out.println(ville);
        }
    }
}