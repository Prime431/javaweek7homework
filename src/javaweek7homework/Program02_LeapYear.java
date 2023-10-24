package javaweek7homework;
/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?

 */
import java.util.Scanner;

public class Program02_LeapYear {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        leapYear(year); // calling method
        scanner.close();
    }
    public static void leapYear(int year) {
        String leap = year % 4 == 0 ? " is a leap year " : " is not a leap year"; // leap year logic
        System.out.print("The year ");
        System.out.println(year + leap);
    }
}