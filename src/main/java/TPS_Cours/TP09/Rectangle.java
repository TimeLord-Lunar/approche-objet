package TPS_Cours.TP09;

public class Rectangle implements ObjetGeometrique
{
    private double longueur;
    private double largeur;

    // Constructor
    public Rectangle(double longueur, double largeur)
    {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Calcul Perimeter
    @Override
    public double perimetre()
    {
        return 2 * (longueur + largeur);
    }

    // Calcul Surface
    @Override
    public double surface()
    {
        return longueur * largeur;
    }

    // ToString
    @Override
    public String toString()
    {
        return "Rectangle (Longueur: " + longueur + ", Largeur: " + largeur + ")";
    }
}
