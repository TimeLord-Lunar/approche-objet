package TPS_Cours.TP05_TP06_TP07_TP08;

public class Debit extends Operation
{
    // Constructor with Super
    public Debit(String dateOperation, double montant)
    {
        super(dateOperation, montant);
    }

    // toString with Override Super
    @Override
    public String getType()
    {
        return "DEBIT";
    }
}
