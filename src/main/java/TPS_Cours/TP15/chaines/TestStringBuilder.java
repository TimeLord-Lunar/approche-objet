package TPS_Cours.TP15.chaines;

public class TestStringBuilder
{
    public static void main(String[] args)
    {
        // Test With StringBuilder
        long debutSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++)
        {
            sb.append(i);
        }
        long finSB = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder : " + (finSB - debutSB) + " ms");

        // Test with String and operator "+"
        long debutString = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i <= 100000; i++)
        {
            str += i;
        }
        long finString = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String : " + (finString - debutString) + " ms");
    }
}
