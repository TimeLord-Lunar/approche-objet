package TPS_Cours.TP04.utils;

public class TestMethodeStatic
{
    public static void main(String[] args)
    {
        // // // TP 4 // // //

        // Integrer Value inside a String
        String chaine = "12";

        // Convert String to Integrer with Integer.parseInt()
        int nombre = Integer.parseInt(chaine);
        System.out.println("Conversion de la chaîne en entier : " + nombre);

        // Two Integrer Variables
        int a = 25;
        int b = 42;

        // Calcul Maximum betweet a and b with Integer.max()
        int max = Integer.max(a, b);
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}
