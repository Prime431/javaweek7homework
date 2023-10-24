package javaweek7homework;

import java.util.Scanner;

//6. Write a java program to input any number and find out if it’s odd or even
public class Program06_OddOrEven {
    public static void main(String[] args) {
        oddOrEven();
    }
    public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) { // odd or even logic
            System.out.println(+number + " = is even number ");
        } else {
            System.out.println(+number + " = is odd number");
        }

    }
}
