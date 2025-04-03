package TPS_AutonomieJ3.maison;

public abstract class Piece
{
    private double superficie;
    private int etage;

    // Constructor
    public Piece(double superficie, int etage)
    {
        if (superficie <= 0 || etage < 0)
        {
            throw new IllegalArgumentException("Superficie et étage doivent être positifs.");
        }
        this.superficie = superficie;
        this.etage = etage;
    }

    // Getter Superficie
    public double getSuperficie()
    {
        return superficie;
    }

    // Getter Etage
    public int getEtage()
    {
        return etage;
    }
}
