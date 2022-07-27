package Spells;

import Enemy.Enemy;
import interfaces.ISpell;

public class FireBall implements ISpell {

    private int dmg;

    public FireBall(int dmg){
        this.dmg = dmg;
    }

    @Override
    public void castSpell(Enemy enemy) {
        enemy.takeDmg(dmg);
    }
}
