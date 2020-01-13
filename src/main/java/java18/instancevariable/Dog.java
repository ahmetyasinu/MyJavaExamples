package java18.instancevariable;

public class Dog {
    public  static String name = "joe";

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name=" + name);
    }
}

 class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();
        fluffy.printName();


    }
}

