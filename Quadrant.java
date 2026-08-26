import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value:");
        double x = sc.nextDouble();
        System.out.println("Enter y value:");
        double y = sc.nextDouble();
        if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("4th Quadrant");
        }
        else if(y==0){
            System.out.println("on x axis");
        }
        else{
            System.out.println("y axis");
        }
    }
}
