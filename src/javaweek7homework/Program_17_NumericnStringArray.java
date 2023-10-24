package javaweek7homework;
//17. Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;
import java.util.Scanner;

public class Program_17_NumericnStringArray {
    static int[] num = {4,5,7,6,8};
    static String[]str = {"Renuka","Patel"};

    public static void main(String[] args) {

        sortNumeric();
    }
    public static void sortNumeric() {

        Arrays.toString(num);
        Arrays.toString(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));
    }

    }


