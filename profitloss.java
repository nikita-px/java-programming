import java.util.Scanner;

public class profitloss {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the cost price");
        int cost = sc.nextInt();
        System.out.println("Enter the selling price:");
        int sell = sc.nextInt();
        if( sell -cost >0){
            int pro= sell- cost ;
            System.out.println("the profit of rupess:"+pro);
        }
        else if (sell- cost<0){
            int loss= cost-sell;
            System.out.println("the loss of rupess :"+loss);


        }
        else {
            System.out.println("no profit no loss");
        }

    }
}
