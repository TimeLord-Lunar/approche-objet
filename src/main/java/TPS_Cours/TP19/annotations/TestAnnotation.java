package TPS_Cours.TP19.annotations;

import TPS_Cours.TP19.annotations.Pays;

public class TestAnnotation
{
    public static void main(String[] args)
    {
        // // // EXERCICE 1 - Constructor without PIB // // //
//        Pays france = new Pays("France", 67, "Europe");
//        Pays japon = new Pays("Japon", 125, "Asie");
//
//        System.out.println(france);
//        System.out.println(japon);

        // // // EXERCICE 2 et 3// // //
//        Pays usa = new Pays("USA", 54562, 905825, "Amérique");
//        Pays france = new Pays("France", 41000, 54100, "Europe");
//
//        System.out.println(usa);
//        System.out.println(france);

        // // // EXERCICE 4 // // //
        try
        {
            Pays paysValide = new Pays("USA", 54562, "Amérique");
            System.out.println(paysValide);

            // Trial with one exception (negative population)
            Pays paysInvalide = new Pays("France", -41000, "Europe");
        } catch (IllegalArgumentException e)
        {
            System.out.println("Erreur de validation: " + e.getMessage());
        }

    }
}
