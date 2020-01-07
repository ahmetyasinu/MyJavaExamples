package java22;

public class KingBurger extends Hamburger {
    private String King1Burger;
    private double King1Price;
    private String King2Burger;
    private double King2Price;


    public KingBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    public KingBurger(String ewa, double price) {
        super("King Burger", ewa, "Brown rye", price);
    }

    public void addKingAddition1(String name, double price) {
        this.King1Burger = name;
        this.King1Price = price;
    }

    public void addKingAddition2(String name, double price) {
        this.King2Burger = name;
        this.King2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.King1Burger != null) {
            hamburgerPrice += this.King1Price;
            System.out.println("Added " + this.King1Burger + " for an extra " + this.King1Price);
        }
        if (this.King2Burger != null){
            hamburgerPrice += this.King2Price;
            System.out.println("Added"+this.King2Burger+"for an extra"+this.King2Price);
        }

        return hamburgerPrice;
    }
}
