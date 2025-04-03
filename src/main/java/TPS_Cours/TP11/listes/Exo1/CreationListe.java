package TPS_Cours.TP11.listes.Exo1;

import java.util.ArrayList;
import java.util.List;

public class CreationListe
{
    public static void main(String[] args)
    {
        // // // EXERCICE 1 // // //

        // Create Integrer List
        List<Integer> listeEntiers = new ArrayList<>();

        // Filling List from 1 to 100
        for (int i = 1; i <= 100; i++)
        {
            listeEntiers.add(i);
        }

        // Display List size
        System.out.println("Taille de la liste : " + listeEntiers.size());
    }
}
