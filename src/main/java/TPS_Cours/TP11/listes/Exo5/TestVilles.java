package TPS_Cours.TP11.listes.Exo5;

import java.util.ArrayList;
import java.util.List;

public class TestVilles
{
    public static void main(String[] args)
    {
        // // // EXERCICE 5 // // //

        // Creation of the list of Ville
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Finding the most populated
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes)
        {
            if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants())
            {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villePlusPeuplee);

        // Finding and deleting the least populated
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes)
        {
            if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants())
            {
                villeMoinsPeuplee = ville;
            }
        }
        villes.remove(villeMoinsPeuplee);
        System.out.println("Suppression de la ville la moins peuplée : " + villeMoinsPeuplee);

        // Modification of Ville with more than 100,000 inhabitants (name in capital letters)
        for (Ville ville : villes)
        {
            if (ville.getNbHabitants() > 100000)
            {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Displaying the final list
        System.out.println("Liste après modifications :");
        for (Ville ville : villes)
        {
            System.out.println(ville);
        }
    }
}
