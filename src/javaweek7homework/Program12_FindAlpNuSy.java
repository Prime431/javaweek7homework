package javaweek7homework;

import java.util.Scanner;

//12. Write a program that tells us input value is number or an alphabet or symbol
public class Program12_FindAlpNuSy {
    public static boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }
    public static boolean isNumber(char c) {
        return Character.isDigit(c);
    }
    public static boolean isSymbol(char c) {
        return !isAlphabet(c) && !isNumber(c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value ");
        char ch = scanner.next().charAt(0);
        if (isAlphabet(ch)) {
            System.out.println("The input is an alphabet");
        } else if (isNumber(ch)) {
            System.out.println("The input is a number");
        } else if (isSymbol(ch)) {
            System.out.println("The input is a symbol");
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
        