package Work2;

class Gun extends Weapon implements Repairable{

    private double distance;
    private static final int MAX_ATK = 100;
    private int count = 0;

    public Gun(String name,int id,int pw,int dt){
        super(name,id);
        this.power = pw;
        this.distance = dt;
    }

    @Override
    public double attack(){
        if(power > 0 && count != 0) --power;
        count ++;
        return power/distance;
    }

    @Override
    public void repair(){
        power = MAX_ATK;
    }
}
