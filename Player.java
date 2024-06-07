package Work2;

public class Player {
    private Weapon[] weapons = new Weapon[10];

    public void attackAll(){
        for(Weapon weapon : weapons){
            if(weapon != null){
                System.out.println("Attacking with " + weapon.toString() + "，Power: " + weapon.attack());
            }
        }
    }

    public void repairAll(){
        for(Weapon weapon : weapons){
            if(weapon instanceof Repairable){
                Repairable repairableWeapon = (Repairable) weapon;
                repairableWeapon.repair();
                System.out.println("Repaired " + weapon.toString());
            }
        }
    }

    public void addWeapon(Weapon weapon){
        for(int i=0;i<weapons.length;i++){
            if(weapons[i] == null){
                weapons[i] = weapon;
                break;
            }
        }
    }
}
