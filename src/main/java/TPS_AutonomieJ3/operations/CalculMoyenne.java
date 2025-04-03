package TPS_AutonomieJ3.operations;

import java.util.Arrays;

public class CalculMoyenne
{
    private double[] valeurs;
    private int taille;

    // Constructor
    public CalculMoyenne()
    {
        this.valeurs = new double[0]; // Tableau vide
        this.taille = 0;
    }

    // Adding
    public void ajout(double valeur)
    {
        valeurs = Arrays.copyOf(valeurs, taille + 1);
        valeurs[taille] = valeur;
        taille++;
    }


    // Calcul
    public double calcul()
    {
        if (taille == 0)
        {
            System.out.println("Le tableau est vide. Impossible de calculer la moyenne.");
            return 0;
        }

        double somme = 0;
        for (double valeur : valeurs)
        {
            somme += valeur;
        }
        return somme / taille;
    }
}
