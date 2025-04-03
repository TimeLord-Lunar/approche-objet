package TPS_Cours.TP11.listes.Exo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString
{
    public static void main(String[] args)
    {
        // // // EXERCICE 4 // // //

        // Create and Initialization List with some Ville
        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Search for the city with the most letters
        String villePlusLongue = "";
        for (String ville : villes)
        {
            if (ville.length() > villePlusLongue.length())
            {
                villePlusLongue = ville;
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettres est : " + villePlusLongue);

        // Convert all cities to uppercase
        for (int i = 0; i < villes.size(); i++)
        {
            villes.set(i, villes.get(i).toUpperCase());
        }

        // Removed cities beginning with 'N'
        Iterator<String> it = villes.iterator();
        while (it.hasNext())
        {
            if (it.next().startsWith("N"))
            {
                it.remove();
            }
        }

        // Displaying the resulting list
        System.out.println("Liste après modifications : " + villes);
    }
}
