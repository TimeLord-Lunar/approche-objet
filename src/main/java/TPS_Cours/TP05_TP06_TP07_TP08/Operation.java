package TPS_Cours.TP05_TP06_TP07_TP08;

public abstract class Operation
{
    protected String dateOperation;
    protected double montant;

    // Constructor
    public Operation(String dateOperation, double montant)
    {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    // Getter Date
    public String getDateOperation()
    {
        return dateOperation;
    }

    // Getter Montant
    public double getMontant()
    {
        return montant;
    }

    // Abstract Method to redefine inside Child class
    public abstract String getType();

    // toString
    @Override
    public String toString()
    {
        return "Date: " + dateOperation + ", Montant: " + montant + " €, Type: " + getType();
    }
}
