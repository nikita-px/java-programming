import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the triangle..");
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        System.out.println("enter number 3");
        int num3 = sc.nextInt();

        if(num1+num2>num3 && num1+num3>num2 && num2+num3> num1){
            System.out.println("Enter length is a side of the triangle ");
        }

    }
}
