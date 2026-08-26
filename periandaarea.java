import java.util.Scanner;

public class periandaarea {
    public static void main(String[] args){
        //Take length and the breadth of the rectangle as input and write a program to
        // whether the area of rectangle is greater than its perimeter

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rectangle length:");

        int len=sc.nextInt();

        System.out.println("Enter Rectangle length:");

        int bred=sc.nextInt() ;

        int area= len* bred;
        int peri = 2*(len + bred);
        if(area>peri){
            System.out.println("Area is greater");

        }
        else {
            System.out.println("perimeter is greater");
        }



    }
}
