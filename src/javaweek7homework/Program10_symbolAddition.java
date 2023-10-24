package javaweek7homework;

import java.util.Scanner;

/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)
*/
public class Program10_symbolAddition {
    public static void main(String[] args) {
        // User enters data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter type of calculation (+, -, *, / :");
        char op = scanner.next().charAt(0);
        //caliing the method calculate
        addition(a, b, op); //calling method
        scanner.close();
    }

    public static int addition(int a, int b, char op) {
        int answer = 0; // logic
        if (op == '+') {
            answer = a + b;
        } else if (op == '-') {
            answer = a - b;
        } else if (op == '*') {
            answer = a * b;
        } else if (op == '/') {
            answer = a / b;
        }
        System.out.println("your answer is:" + answer);
        return answer;
    }

    }
