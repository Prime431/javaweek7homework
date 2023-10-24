package javaweek7homework;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class Program_16_Pos_Neg_Zer {
    public static void main(String[] args) { //declaring main method
        Scanner scanner = new Scanner(System.in); // using scanner
        System.out.println("Please enter the Number");
        int number = scanner.nextInt();
        checkNumber(number); // calling check-number method
        scanner.close();
    }
    public static void checkNumber(int number){
        if(number>0){ // using if else for identify the positive or negative number
            System.out.println("Number is positive");
        }
        else if (number<0){
            System.out.println("Number is Negative");
        }
        else
            System.out.println("Number is Zero");

    }
}
