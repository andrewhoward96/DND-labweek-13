package Weapons;

import Enemy.Enemy;
import interfaces.IWeapon;

public class Axe implements IWeapon {

    private int dmg;

    public Axe(int dmg){
        this.dmg = dmg;
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDmg(dmg);
    }
}
