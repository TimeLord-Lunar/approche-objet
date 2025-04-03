package TPS_Cours.TP12.tri.Exo4;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>
{
    // Compare by Number
    @Override
    public int compare(Ville v1, Ville v2)
    {
        return Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()); // Tri décroissant
    }
}
