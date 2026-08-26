import java.util.Scanner;

public class absolute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("the enter number is :");
        int num1=sc.nextInt();

        if(num1<0){
            num1=num1*(-1);
            System.out.println(num1);
        }
        else {
            System.out.println(num1);
        }
    }
}
