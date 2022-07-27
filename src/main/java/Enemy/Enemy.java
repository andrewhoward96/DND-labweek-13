package Enemy;

import Player.Player;

public abstract class Enemy {

    private int hp;
    private int dmg;

    public Enemy( int hp, int dmg){
        this.dmg = dmg;
        this.hp = hp;
}

    public int getHp() {
        return hp;
    }

    public void takeDmg(int value){
        hp -= value;
    }

    public void attack(Player player){
        player.reduceHp(dmg);
    }

}
