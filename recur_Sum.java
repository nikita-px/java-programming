// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class recur_Sum {
   public static void printSum(int i,int sum ,int n){
       if(i>n){
           System.out.println("The sum of the n natural number is:"+sum);
           return;
       }
      sum+=i;
      printSum(i+1,sum,n);
       }
    public static void main(String[] args) {
    //   int n=1;
       printSum(1,0,5);
    }
}
