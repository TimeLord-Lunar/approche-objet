package TPS_Cours.TP16.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar
{
    public static void main(String[] args)
    {
        // Created a date with Calendar: 05/19/2016 at 11:59:30 PM
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateCal1 = cal1.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date spécifique avec Calendar : " + format1.format(dateCal1));

        // Current date with Calendar
        Calendar calAujourdhui = Calendar.getInstance();
        Date dateAujourdhui = calAujourdhui.getTime();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date actuelle : " + format2.format(dateAujourdhui));

        // Display with names of days and months in different languages
        SimpleDateFormat formatFR = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRENCH);
        SimpleDateFormat formatRU = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
        SimpleDateFormat formatZH = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
        SimpleDateFormat formatDE = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);

        System.out.println("Français : " + formatFR.format(dateAujourdhui));
        System.out.println("Russe : " + formatRU.format(dateAujourdhui));
        System.out.println("Chinois : " + formatZH.format(dateAujourdhui));
        System.out.println("Allemand : " + formatDE.format(dateAujourdhui));
    }
}
