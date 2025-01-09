package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); //out: 1/8/25, 5:53 PM
        df[1] = DateFormat.getDateInstance(); //out: Jan 8, 2025
        df[2] = DateFormat.getDateTimeInstance(); // out: Jan 8, 2025, 5:53:50PM
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //out: 1/8/25
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //out: Jan 8, 2025
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); //out: January 8, 2025
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); //out: Wednesday, January 8, 2025

        for (DateFormat dateFormat: df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
