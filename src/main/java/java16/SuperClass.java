package java16;

public class SuperClass {
    public void printMethod() {
        System.out.println("Printed in SuperClass.");

    }
}
class SubClass extends SuperClass{
    public void printMethod(){
        super.printMethod();
        System.out.println("printed in subclass");
    }
}
class mainclass{
    public static void main(String[] args){
        SubClass s = new SubClass();
        s.printMethod();
    }
}
