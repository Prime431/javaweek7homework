package javaweek7homework;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
*/

public class Program03_MarkSheet {
    public static void main(String[] args) {
        marks();
    }

    public static void marks() {
        String name = "Jay";
        int rollNumber = 8;
        int math = 38;
        int science = 05;
        int english = 50;
        int total = math + science + english; //total logic
        double percentage = (total / 3); // percentage logic
        System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("|    Name        :"+name+"           |");
        System.out.println("|    Roll No     :"+rollNumber+"             |");
        System.out.println("|_______________________________|");
        System.out.println("|    Subject     :Marks         |");
        System.out.println("|_______________________________|");
        System.out.println("|Math            :"+math+"            |");
        System.out.println("|Science         :"+science+"             |");
        System.out.println("|English         :"+english+"            |");
        System.out.println("|_______________________________|");
        System.out.println("|Total           :"+total+"            |");
        System.out.println("|_______________________________|");
        System.out.println("|Percentage      :"+percentage+"          |");
        if (science <= 0 || science >= 100 || math <= 0 || math >= 100 || english <= 0 || english >= 100) { //minimum and maximum marks logic
            System.out.println("|Input is Invalid           |");

        } else if (math <= 35 && science <= 35 && english <= 35) {
            System.out.println("|Result: Fail");
        } else if (percentage >= 80 && percentage < 100) {
            System.out.println("|Result          :Pass          |");
            System.out.println("|Grade           :A+            |");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("|Result          :Pass          |");
            System.out.println("|Grade           :A             |");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("|Result          :Pass          |");
            System.out.println("|Grade           :B             |");
        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("|Result          :Pass          |");
            System.out.println("|Grade           :C             |");
        } else {
            System.out.println("|Result          :Fail          |");

        }
        System.out.println("|_______________________________|");
    }
}