package Player.Mage;

import Enemy.Enemy;
import Player.Player;
import interfaces.IDefend;
import interfaces.ISpell;
import interfaces.IWeapon;

public abstract class Mage extends Player {

    ISpell spell;
    IDefend creature;


    public Mage(String name, int hp, ISpell spell,IDefend creature) {
        super(name, hp);
        this.spell = spell;
        this.creature = creature;
    }
    public void castSpell(Enemy enemy){
        spell.castSpell(enemy);
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public IDefend getCreature() {
        return creature;
    }

    public void setCreature(IDefend creature) {
        this.creature = creature;
    }
    public void reduceHp(int dmg){
        super.reduceHp(dmg - creature.defend());

    }
}
