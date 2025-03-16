package academy.devdojo.maratonajava.introduction.class03ConditionalStructures;

/*
* Given the values from 1 to 7, print whether it is a weekday or a weekend
* considering 1 as sunday
* */
public class Exercises02Switch {
    public static void main(String[] args) {

        byte day = 4;

        switch(day) {
            case 1:
                System.out.println("Today is sunday, a weekend day");
                break;
            case 2:
            System.out.println("Today is monday, a weekday");
                break;
            case 3:
                System.out.println("Today is tuesday, a weekday");
                break;
            case 4:
                System.out.println("Today is wednesday, a weekday");
                break;
            case 5:
                System.out.println("Today is thursday, a weekday");
                break;
            case 6:
                System.out.println("Today is friday, a weekday");
                break;
            case 7:
                System.out.println("Today is saturday, a weekend day");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
