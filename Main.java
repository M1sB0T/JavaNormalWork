package Work2;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.addWeapon(new Knife("Dr",1,50));
        player.addWeapon(new Gun("Bl",2,100,50));
        player.attackAll();
        player.repairAll();
        player.attackAll();
    }
}
