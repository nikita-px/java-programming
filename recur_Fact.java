// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class recur_Fact {
   public static void printfact(int n,int fact){
       if(n==1){
           System.out.println("The fact of the n natural number is:"+fact);
           return;
       }
    //   fact=1;
      fact*=n;
      printfact(n-1,fact);
       }
    public static void main(String[] args) {
    //   int n=1;
       printfact(5,1);
    }
}
