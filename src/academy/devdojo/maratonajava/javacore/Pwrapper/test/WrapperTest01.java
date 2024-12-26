package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //boxing - autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'a';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean truthy = Boolean.parseBoolean("TruE");
        System.out.println(truthy);

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('2'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Character.toLowerCase('R'));

    }
}
