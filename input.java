import java.util.Scanner;

public class input {
    public static void main(String[] args){

        //calculating the area of the circle ...

        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
         double res=3.141*r*r;
        System.out.println("the area of the circle in which the radius is given by the user:"+res);

        double num2=sc.nextDouble();
        System.out.println(num2);

    }

}
