package TPS_Cours.TP05_TP06_TP07_TP08;

public class Compte
{
    // Private Values
    private String numeroCompte;
    private double solde;

    // Constructor
    public Compte(String numeroCompte, double solde)
    {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    // Getter Account Number
    public String getNumeroCompte()
    {
        return numeroCompte;
    }

    // Setter Account Number
    public void setNumeroCompte(String numeroCompte)
    {
        this.numeroCompte = numeroCompte;
    }

    // Getter Money
    public double getSolde()
    {
        return solde;
    }

    // Setter Money
    public void setSolde(double solde)
    {
        this.solde = solde;
    }

    // // // TP 6 - 7 // // //
    // toString
    @Override
    public String toString()
    {
        return "Compte{" +
                "numéro='" + numeroCompte + '\'' +
                ", solde=" + solde + " €" +
                '}';
    }
}
