package javaweek7homework;
//18. Write a Java program to sum values of an array
public class Program_18_SumOfArray {
   static int[] number = {5,10,2,3,20};
static int sum = 0;
    public static void main(String[] args) {
sumOfArray();
    }
    public static void sumOfArray() {
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum of all the elements of an array:" +sum);
    }
}
