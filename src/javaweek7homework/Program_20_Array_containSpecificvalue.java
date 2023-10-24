package javaweek7homework;
//20. Write a Java program to test if an array contains a specific value.

public class Program_20_Array_containSpecificvalue {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 57, 9};
        int valuaTofind = 57;
        boolean contains = contiansValue(numbers, valuaTofind);
        if (contains) {
            System.out.println("The array contains the value " + valuaTofind);
        } else {
            System.out.println("The array does not contain the value " + valuaTofind);
        }
    }

    public static boolean contiansValue(int[] arr, int value) {
        for (int elements : arr) {
            if (elements == value) {
                return true;
            }
        }
        return false;
    }
}
