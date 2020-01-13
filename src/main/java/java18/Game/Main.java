package java18.Game;

public class Main {
    public static void main(String[] args) {
      /*  Player player = new Player();
        player.name ="thin";
        player.health =20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining"+player.healtRemaining());
        damage =11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining"+player.healtRemaining());*/
      EnhancedPlayer player = new EnhancedPlayer("tim",50,"sword");
        System.out.println("Inıtıal health is"+player.getHealth());

    }




}
