package TPS_AutonomieJ3.maison;

public class TestMaison
{
    public static void main(String[] args)
    {
        // Creation of a house
        Maison maison = new Maison();

        // Adding Rooms
        maison.ajouterPiece(new Chambre(12, 1));
        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new SalleDeBain(8, 1));
        maison.ajouterPiece(new WC(3, 1));
        maison.ajouterPiece(new Chambre(14, 2));
        maison.ajouterPiece(new Chambre(10, 2));

        // Null addition test
        maison.ajouterPiece(null);

        // Total area
        System.out.println("Superficie totale de la maison : " + maison.getSuperficieTotale() + " m²");

        // Surface area of the 1st floor
        System.out.println("Superficie du 1er étage : " + maison.getSuperficieEtage(1) + " m²");

        // Room size
        System.out.println("Superficie des chambres : " + maison.getSuperficieType(Chambre.class) + " m²");

        // Number of rooms
        System.out.println("Nombre de chambres : " + maison.getNombrePiecesType(Chambre.class));
    }
}
