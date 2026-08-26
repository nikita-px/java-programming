import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is number is even number");
        }
        else {
            System.out.println(num+" the enter number is add");
        }
    }
}
