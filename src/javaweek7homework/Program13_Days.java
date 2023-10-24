package javaweek7homework;
/*13. Write a Java program which input any number between 1 to 7 and it print The Days
        name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
        NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/
import java.util.Scanner;

public class Program13_Days {
    public static void days(int daysnumber) {
        String dayName;
        switch (daysnumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Week conditions 1 to 7 days";
                break;
        }
        System.out.println("Day of the week: " + dayName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int inputNumber = scanner.nextInt();
        days(inputNumber);
        scanner.close();
    }

}
