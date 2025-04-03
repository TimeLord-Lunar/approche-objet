package TPS_AutonomieJ3.operations;

public class Operations
{
    // Calcul
    public static double calcul(double a, double b, char operateur)
    {
        switch (operateur)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0)
                {
                    return a / b;
                } else
                {
                    System.out.println("Erreur : Division par zéro !");
                    return Double.NaN;
                }
            default:
                System.out.println("Erreur : Opérateur invalide !");
                return Double.NaN;
        }
    }
}
