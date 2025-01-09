package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //ISO 639
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("Ja", "JA");
        Locale localeRussia = new Locale("Ru", "RU");

        Calendar calendar = Calendar.getInstance();
        DateFormat df0 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeRussia);

        System.out.println("Default " +df0.format(calendar.getTime()));
        System.out.println("Brazil " +df1.format(calendar.getTime()));
        System.out.println("Italy " +df2.format(calendar.getTime()));
        System.out.println("Switzerland " +df3.format(calendar.getTime()));
        System.out.println("India " +df4.format(calendar.getTime()));
        System.out.println("Japan  " +df5.format(calendar.getTime()));
        System.out.println("Russia  " +df6.format(calendar.getTime()));
    }
}
