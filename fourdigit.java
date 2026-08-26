import java.util.Scanner;

public class fourdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>999 && num<10000){
            System.out.println("four digit number");
        }
        else {
            System.out.println("not four digit number");
        }
    }
}
