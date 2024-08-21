package academy.devdojo.maratonajava.introduction;

public class Class05ConditionalsStructures06 {
    public static void main(String[] args) {
        //Using switch and the following values from 1 to 7, print if its weekday or weekend
        //Considering 1 as sunday
        byte number = 5;
        switch (number){
            case 7:
            case 1:
                System.out.println("Its weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Its weekday");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
