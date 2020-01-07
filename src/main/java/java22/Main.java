package java22;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", "white", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
        KingBurger kingBurger = new KingBurger("sadas", 11);
        kingBurger.addHamburgerAddition1("sosis",5.5);
        kingBurger.addHamburgerAddition2("yem",6.5);
        System.out.println("safgdasd"+kingBurger.itemizeHamburger());
    }


}