package Spells;

import Enemy.Enemy;
import interfaces.ISpell;

public class LightingStrike implements ISpell {

    private int dmg;

    public LightingStrike(int dmg){
        this.dmg = dmg;
    }

    @Override
    public void castSpell(Enemy enemy) {
        enemy.takeDmg(dmg);
    }
}
