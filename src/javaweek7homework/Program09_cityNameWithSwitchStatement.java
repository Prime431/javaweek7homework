package javaweek7homework;
//9. Same as above program-8 using switch statement
public class Program09_cityNameWithSwitchStatement {
    public static void main(String[] args) {
        char alphabet = 'E';// logic
        switch (alphabet){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bihar");
                break;
            case 'c':
                System.out.println("culcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("East London");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Ïnvalid entry");

        }
    }
}
