package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeItaly = Locale.ITALY;
        Locale localeJapan = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeDefault);
        nfa[3] = NumberFormat.getInstance(localeItaly);
        double value = 10_000_000.2123;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }

    }
}
