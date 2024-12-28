package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "  Tanjiro  ";
        String numbers = "012345    ";
        System.out.println(name.charAt(3)); //out: a
        System.out.println(name.length()); //out: 11
        System.out.println(name.replace("o", "a")); //out:   Tanjira
        System.out.println(name.toLowerCase()); //out:   tanjiro
        System.out.println(name.toUpperCase()); //out:   TANJIRO
        System.out.println(numbers.length()); //out: 10
        System.out.println(numbers.substring(3)); //out: 345
        System.out.println(numbers.substring(3, numbers.length())); //out: 345
        System.out.println(name.trim()); //remove whitespaces, out: Tanjiro
    }
}
