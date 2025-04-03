package TPS_Cours.TP12.tri.Exo4;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorNom implements Comparator<Ville>
{
    private final Collator collator = Collator.getInstance(Locale.FRENCH);

    // Compare by Name
    @Override
    public int compare(Ville v1, Ville v2)
    {
        return collator.compare(v1.getNom(), v2.getNom());
    }
}
