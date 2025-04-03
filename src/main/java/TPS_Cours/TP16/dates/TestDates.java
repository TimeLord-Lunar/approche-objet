package TPS_Cours.TP16.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates
{
    public static void main(String[] args)
    {
        // Creating a Date instance for today's date
        Date dateAujourdhui = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + format1.format(dateAujourdhui));

        // Creation of a specific date: 05/19/2016 at 11:59:30 PM
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30); // Année 116 = 2016 (ajouter 1900)
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date spécifique : " + format2.format(dateSpecifique));

        // Current system date in detailed format
        System.out.println("Date actuelle formatée : " + format2.format(new Date()));
    }
}
