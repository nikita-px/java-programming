import java.util.Scanner;

public class fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        double n1=sc.nextDouble();

        //conditional loop

        if(n1 %3==0 && n1%5==0){
            System.out.println("Divisible by 3 and 5");
        } else if (n1 %3==0) {
            System.out.println("divisible by 3");
        } else if (n1 %5 ==0) {
            System.out.println("divisible by 5");
        }
        else {
            System.out.println("not divisible by 5 and 3");
        }
    }

}
