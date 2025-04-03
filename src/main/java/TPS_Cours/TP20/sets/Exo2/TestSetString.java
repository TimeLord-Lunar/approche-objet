package TPS_Cours.TP20.sets.Exo2;

import java.util.HashSet;
import java.util.Set;

public class TestSetString
{
    public static void main(String[] args)
    {
        // Creating the HashSet and Adding elements one by one
        Set<String> paysSet = new HashSet<>();

        paysSet.add("USA");
        paysSet.add("France");
        paysSet.add("Allemagne");
        paysSet.add("UK");
        paysSet.add("Italie");
        paysSet.add("Japon");
        paysSet.add("Chine");
        paysSet.add("Russie");
        paysSet.add("Inde");

        System.out.println("Pays dans le HashSet : " + paysSet);

        // Search for the country with the most letters
        String paysLePlusLong = null;
        for (String pays : paysSet)
        {
            if (paysLePlusLong == null || pays.length() > paysLePlusLong.length())
            {
                paysLePlusLong = pays;
            }
        }

        System.out.println("Le pays avec le plus grand nombre de lettres est : " + paysLePlusLong);

        // Deleting the found country
        if (paysLePlusLong != null)
        {
            paysSet.remove(paysLePlusLong);
            System.out.println("Suppression du pays : " + paysLePlusLong);
        }

        // Final display of the HashSet
        System.out.println("Pays après suppression : " + paysSet);
    }
}
