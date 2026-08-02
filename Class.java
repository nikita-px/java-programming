
//create the class --class name always start with capital letter.. 
class Pen{
    String color;//create variable
    String type;
    //create the function ---name always start with the small letter ...
    public void write1(){
        System.out.println("Writing something from gel pen ");
    }
    
    public void write2(){
        System.out.println("Writing something from ball pen ");
    }
     
     public void printColor(){
         System.out.println(this.color);//this show this object is reffering
     }
}


class Class {
    public static void main(String[] args) {
        pen pen1=new pen();// object is created pen1
        pen1.color="blue";
        pen1.type="gel";
        
        pen1.write1(); //function call 
        pen1.printColor();//function call
        
        pen pen2=new pen();// next object is created
        pen2.color="black";
        pen2.type="ballpen";
        
        pen2.write2();//function is call
        pen2.printColor();
        System.out.println("END!!");
    }
}
