package TPS_AutonomieJ3.entites;

public class TestTheatre
{
    public static void main(String[] args)
    {
        // Creation of a theater with a maximum capacity of 50 seats
        Theatre theatre = new Theatre("Théâtre Royal", 50);

        // Customer registration attempts
        theatre.inscrire(20, 10.0);  // 20 clients à 10€/place
        theatre.inscrire(15, 12.5);  // 15 clients à 12.5€/place
        theatre.inscrire(10, 8.0);   // 10 clients à 8€/place
        theatre.inscrire(10, 15.0);  // Devrait afficher une erreur (capacité max atteinte)

        // Displaying final results
        System.out.println("\n Résumé du théâtre");
        System.out.println(" Total clients inscrits : " + theatre.getTotalClients());
        System.out.println(" Recette totale : " + theatre.getRecetteTotale() + "€");
    }
}
