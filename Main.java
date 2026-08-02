
abstract class animal{ // which is not shown 
    abstract void walk();// abstact method does not contain body 
    public void go(){
        System.out.println("Animal can walk");
    }
}
 class Horse extends animal{
    public void walk(){
        System.out.println("Animal is a horse and it can walk");
    }
}
class Birds extends animal{
    public void walk(){
        System.out.println("Birds is a Animal and it can walk and fly");
    }
}
class Main {
    public static void main(String[] args) {
        Horse h1=new Horse();
        Birds b1=new Birds();
        h1.walk();
        b1.walk();
        h1.go();
    }
}
