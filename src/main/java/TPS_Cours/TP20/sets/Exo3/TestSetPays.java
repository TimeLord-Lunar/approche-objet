package TPS_Cours.TP20.sets.Exo3;

import java.util.HashSet;

public class TestSetPays
{
    public static void main(String[] args)
    {
        // Instantiating the HashSet with the given elements
        HashSet<Pays> paysSet = new HashSet<>();

        paysSet.add(new Pays("USA", 331000000, 63543));
        paysSet.add(new Pays("France", 67000000, 41463));
        paysSet.add(new Pays("Allemagne", 83000000, 46450));
        paysSet.add(new Pays("UK", 67000000, 42315));
        paysSet.add(new Pays("Italie", 60000000, 34567));
        paysSet.add(new Pays("Japon", 125000000, 40245));
        paysSet.add(new Pays("Chine", 1411000000, 10500));
        paysSet.add(new Pays("Russie", 144000000, 11430));
        paysSet.add(new Pays("Inde", 1380000000, 2100));

        // Show all Pays and their total PIB for verification
        System.out.println("Tous les pays et leur PIB total:");
        for (Pays pays : paysSet)
        {
            System.out.println(pays);
        }
        System.out.println();

        // Find the Pays with the highest PIB
        Pays paysPibParHabitantMax = null;
        Pays paysPibTotalMax = null;
        Pays paysPibTotalMin = null;

        for (Pays pays : paysSet)
        {
            if (paysPibParHabitantMax == null || pays.pibParHabitant > paysPibParHabitantMax.pibParHabitant)
            {
                paysPibParHabitantMax = pays;
            }
            if (paysPibTotalMax == null || pays.getPibTotal() > paysPibTotalMax.getPibTotal())
            {
                paysPibTotalMax = pays;
            }
            if (paysPibTotalMin == null || pays.getPibTotal() < paysPibTotalMin.getPibTotal())
            {
                paysPibTotalMin = pays;
            }
        }

        // Displaying results
        System.out.println("\nPays avec le PIB/habitant le plus élevé : " + paysPibParHabitantMax.nom);
        System.out.println("Pays avec le PIB total le plus élevé   : " + paysPibTotalMax.nom);
        System.out.println("Pays avec le PIB total le plus bas     : " + paysPibTotalMin.nom + "\n");

        // Change the name of the Pays with the lowest total PIB to capital letters
        paysSet.remove(paysPibTotalMin);
        paysSet.add(new Pays(paysPibTotalMin.nom.toUpperCase(), paysPibTotalMin.population, paysPibTotalMin.pibParHabitant));

        // Remove the Pays with the highest total PIB
        paysSet.remove(paysPibTotalMax);

        // Final display of Pays after modification
        System.out.println("Pays après modifications :");
        for (Pays pays : paysSet)
        {
            System.out.println(pays);
        }
    }
}
