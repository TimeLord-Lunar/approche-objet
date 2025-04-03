package TPS_AutonomieJ3.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison
{
    // Create List of Rooms
    private List<Piece> pieces = new ArrayList<>();

    // Adding a room to the house with verification
    public void ajouterPiece(Piece piece)
    {
        if (piece == null)
        {
            System.out.println("Erreur : Impossible d'ajouter une pièce null.");
            return;
        }
        pieces.add(piece);
    }

    // Calculating the total area of the house
    public double getSuperficieTotale()
    {
        double total = 0;
        for (Piece piece : pieces)
        {
            total += piece.getSuperficie();
        }
        return total;
    }

    // Calculating the area for a given floor
    public double getSuperficieEtage(int etage)
    {
        double total = 0;
        for (Piece piece : pieces)
        {
            if (piece.getEtage() == etage)
            {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    // Calculating the total area for a given room type
    public double getSuperficieType(Class<?> type)
    {
        double total = 0;
        for (Piece piece : pieces)
        {
            if (piece.getClass().equals(type))
            {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    // Total number of Rooms of a given type
    public int getNombrePiecesType(Class<?> type)
    {
        int count = 0;
        for (Piece piece : pieces)
        {
            if (piece.getClass().equals(type))
            {
                count++;
            }
        }
        return count;
    }
}
