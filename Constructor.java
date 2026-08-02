class Student{
    String name;
    int age;

public void printInfo(String name){
    System.out.println(name);
}

public void printInfo(int age){
    System.out.println(age);
}

public void printInfo(String name,int age){
    System.out.println(name+" "+age);
}

}

class Main {
    public static void main(String[] args) {
       
        
        Student s1 =new Student();
        s1.name="Nikita";
        s1.age=22;
        s1.printInfo(s1.name,s1.age);//parametorized constructor 
        System.out.println("END!!");
    }
}
