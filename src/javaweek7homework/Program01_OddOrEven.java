package javaweek7homework;
/*1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)
*/
import java.util.Scanner;

public class Program01_OddOrEven {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // using scnner
        System.out.println("Enter number to test");
        int number = scanner.nextInt();
        oddOrEven(number); //calling method
        scanner.close();
    }

    public static void oddOrEven(int number) {

        String result = number % 2 == 0 ? "Even" : "Odd"; //odd or even logic
        System.out.println(number + " is " + result);
    }

}

