package Weapons;

import Enemy.Enemy;
import interfaces.IWeapon;

public class Club implements IWeapon {
    private int dmg;

    public Club(int dmg){
        this.dmg = dmg;
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDmg(dmg);
    }
}
