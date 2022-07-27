package Weapons;

import Enemy.Enemy;
import interfaces.IWeapon;

public class Sword implements IWeapon {

    private int dmg;

    public Sword(int dmg){
        this.dmg = dmg;
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDmg(dmg);
    }
}
