package Player;

public abstract class Player {

    private String name;
    private int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }


    public int getHp() {
        return hp;
    }

    public void reduceHp(int dmg){
        hp -= dmg;

    }
    public void restoreHp(int healValue){
        hp += healValue;

    }


}
