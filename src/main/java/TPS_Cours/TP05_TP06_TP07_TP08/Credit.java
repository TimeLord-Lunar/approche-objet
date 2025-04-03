package TPS_Cours.TP05_TP06_TP07_TP08;

public class Credit extends Operation
{
    // Constructor with Super
    public Credit(String dateOperation, double montant)
    {
        super(dateOperation, montant);
    }

    // toString
    @Override
    public String getType()
    {
        return "CREDIT";
    }
}
