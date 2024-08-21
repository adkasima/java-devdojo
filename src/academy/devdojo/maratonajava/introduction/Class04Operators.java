package academy.devdojo.maratonajava.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        //+ - * /
        int number01 = 10;
        int number02 = 20;
        double result = (double) number01 / number02;
        System.out.println(result);
        System.out.println("=====<>=====");

        // %
        int remainder = 23 % 2;
        System.out.println(remainder);
        System.out.println("=====<>=====");


        // < > <= >= == !=
        boolean isTenBIggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        System.out.println("isTenBIggerThanTwenty " + isTenBIggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty " + isTenSmallerThanTwenty);
        System.out.println("isTenEqualTwenty " + isTenEqualTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);
        System.out.println("=====<>=====");


        // && (AND) || (OR)
        int age = 35;
        float salary = 3500F;
        boolean isLawfulOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLawfulYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLawfulOlderThanThirty " + isLawfulOlderThanThirty);
        System.out.println("isLawfulYoungerThanThirty " + isLawfulYoungerThanThirty);
        System.out.println("=====<>=====");

        double checkingAccountValue = 200D;
        double savingAccountValue = 10000D;
        float playstationValue = 5000F;
        boolean isPlaystationBuyable = checkingAccountValue > playstationValue || savingAccountValue > playstationValue;
        System.out.println("isPlaystationBuyable " +isPlaystationBuyable);
        System.out.println("=====<>=====");

        // = += -= *= /=
        float bonus = 1800F;
        bonus += 1000F; //2800
        System.out.println(bonus);
        bonus -= 1000F; //1800
        System.out.println(bonus);
        bonus *= 2; //3600
        System.out.println(bonus);
        bonus /= 2; //1800
        System.out.println(bonus);



    }
}
