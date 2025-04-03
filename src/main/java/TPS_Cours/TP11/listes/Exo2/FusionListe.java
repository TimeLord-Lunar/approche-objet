package TPS_Cours.TP11.listes.Exo2;

import java.util.ArrayList;
import java.util.List;

public class FusionListe
{
    public static void main(String args[])
    {
        // // // EXERCICE 2 // // //

        // Create Two Lists
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // Create Merged List
        List<String> liste3 = new ArrayList<>();

        // Add Elements in List 3 from List1
        for (String couleur : liste1)
        {
            liste3.add(couleur);
        }

        // Add Elements in List3 from List2
        for (String couleur : liste2)
        {
            liste3.add(couleur);
        }

        // Display Merged List
        System.out.println("Liste fusionnée : " + liste3);
    }
}
