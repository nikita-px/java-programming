import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the enter number is :");
        double num1 = sc.nextDouble();

        //type casting

        int x=(int) num1;


        if (num1-x >=0) {

            System.out.println("the number is not an integer number");
        } else {
            System.out.println("the number is an integer nummber");
        }
    }
}
