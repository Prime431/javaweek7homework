package javaweek7homework;

//19. Write a Java program to calculate the average value of array elements.
public class Program_19_AverageValueArray {
    public static void main(String[] args) {
        Average();
    }

    public static void Average() {
        int[] number = new int[]{10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            //calculate average value
        }
        double average = sum / number.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
