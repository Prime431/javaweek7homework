package javaweek7homework;

/*11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
        and 5 separately.
*/
public class Program11_devidedBy3N5 {
    public static void main(String[] args) {
        division();
    }

    public static void division() {
        System.out.print("Number Division by 3 : ");

        for (int i = 1; i <= 100; i++) { //logic for consider the number from 1 to 100
            if (i % 3 == 0) { //logic for divide by 3
                System.out.print(i + ".");
            }
        }
        System.out.println();
        System.out.print("Number Division by 5 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) { // logic of divide by 5
                System.out.print(i + ".");
            }
        }
    }
}
