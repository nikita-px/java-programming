import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ternary1 {
    //greatest number from 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a= sc.nextInt();
        System.out.println((a%2==0)? "Even ": "odd");
    }


}
