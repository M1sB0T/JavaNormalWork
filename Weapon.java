package Work2;

abstract class Weapon {
    protected int id;
    protected String nickname;
    protected float power;

    public Weapon(String nickname,int id){
        this.nickname = nickname;
        this.id = id;
    }

    public abstract double attack();

    @Override
    public String toString(){
        return "Weapon{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
