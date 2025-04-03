package TPS_AutonomieJ3.operations;

public class TestOperations
{
    public static void main(String[] args)
    {
        // Testing the different operations
        double resultat1 = Operations.calcul(10, 5, '+');
        double resultat2 = Operations.calcul(10, 5, '-');
        double resultat3 = Operations.calcul(10, 5, '*');
        double resultat4 = Operations.calcul(10, 5, '/');
        double resultat5 = Operations.calcul(10, 0, '/');
        double resultat6 = Operations.calcul(10, 5, '%');

        // Displaying results
        System.out.println("10 + 5 = " + resultat1);
        System.out.println("10 - 5 = " + resultat2);
        System.out.println("10 * 5 = " + resultat3);
        System.out.println("10 / 5 = " + resultat4);
        System.out.println("10 / 0 = " + resultat5);
        System.out.println("10 % 5 = " + resultat6);
    }
}
