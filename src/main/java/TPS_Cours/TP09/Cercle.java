package TPS_Cours.TP09;

public class Cercle implements ObjetGeometrique
{
    private double rayon;

    // Constructor
    public Cercle(double rayon)
    {
        this.rayon = rayon;
    }

    // Calcul Perimeter
    @Override
    public double perimetre()
    {
        return 2 * Math.PI * rayon;
    }

    // Calcul Surface
    @Override
    public double surface()
    {
        return Math.PI * rayon * rayon;
    }

    // ToString
    @Override
    public String toString()
    {
        return "Cercle (Rayon: " + rayon + ")";
    }
}
