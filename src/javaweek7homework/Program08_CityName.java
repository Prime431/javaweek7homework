package javaweek7homework;

import java.util.Scanner;

/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry

 */
public class Program08_CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char inputAlphabet = scanner.next().charAt(0);
        // convert the input to uppercase to handle both lowercase and uppercase inputs
        inputAlphabet = Character.toUpperCase(inputAlphabet);
        //Calling the printCityName method to declare and print the city name
        printCityName(inputAlphabet);
        scanner.close();
    }

    public static void printCityName(char alphabet) {
        // Method to find and return the city name based on the input alphabet

        if (alphabet == 'A') {
            System.out.println("City Name : Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City Name : Baroda");
        } else if (alphabet == 'C') {
            System.out.println("City Name : Culcutta");
        } else if (alphabet == 'D') {
            System.out.println("City Name : Dandi");
        } else if (alphabet == 'E') {
            System.out.println("City Name : East Mumbai");
        } else if (alphabet == 'F') {
            System.out.println("City Name : Firozabad");
        } else {
            System.out.println("Invalid Entry : Please enter and alphabet from A to F.");

        }
    }

}

