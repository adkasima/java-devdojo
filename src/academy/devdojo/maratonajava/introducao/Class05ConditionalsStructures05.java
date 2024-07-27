package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalsStructures05 {
    public static void main(String[] args) {
        // print the day of week, considering 1 as sunday

        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Its sunday!");
                break;
            case 2:
                System.out.println("Its monday!");
                break;
            case 3:
                System.out.println("Its tuesday!");
                break;
            case 4:
                System.out.println("Its wednesday!");
                break;
            case 5:
                System.out.println("Its thursday!");
                break;
            case 6:
                System.out.println("Its friday!");
                break;
            case 7:
                System.out.println("Its saturday!");
                break;        }
    }
}
