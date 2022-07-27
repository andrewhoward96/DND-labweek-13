package Player.fighter;

import Enemy.Enemy;
import Player.Player;
import interfaces.ISpell;
import interfaces.IWeapon;

public abstract class Fighter extends Player {

    private IWeapon weapon;


    public Fighter(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }
    public void attack(Enemy enemy){
        weapon.attackEnemy(enemy);
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


}
