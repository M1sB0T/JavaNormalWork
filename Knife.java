package Work2;

class Knife extends Weapon implements Repairable{

    private static final int MAX_ATK = 100;
    private int count =0;

    public Knife(String name,int id,float pw){
        super(name,id);
        this.power = pw;
    }

    @Override
    public double attack(){
        if(power > 0 && count !=0) --power;
        count++;
        return power;
    }

    @Override
    public void repair(){
        power = MAX_ATK;
    }
}
