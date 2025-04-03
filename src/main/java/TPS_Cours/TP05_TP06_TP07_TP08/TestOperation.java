package TPS_Cours.TP05_TP06_TP07_TP08;

public class TestOperation
{
    public static void main(String[] args)
    {
        // // // TP 8 // // //

        // Create Array of Operations
        Operation[] operations = new Operation[4];

        // Add Operations inside Array (2 of each types)
        operations[0] = new Credit("2025-03-01", 1000.00);
        operations[1] = new Debit("2025-03-02", 500.00);
        operations[2] = new Credit("2025-03-03", 200.00);
        operations[3] = new Debit("2025-03-04", 100.00);

        // Initialization money
        double soldeTotal = 0.0;

        // Display and Calcul Loop
        for (Operation op : operations)
        {
            System.out.println(op);
            if (op.getType().equals("CREDIT"))
            {
                soldeTotal += op.getMontant();
            } else
            {
                soldeTotal -= op.getMontant();
            }
        }

        // Display Final Ammount
        System.out.println("Solde final du compte: " + soldeTotal + " €");
    }
}
