package Player.Healer;

import Player.Player;
import interfaces.IDefend;
import interfaces.IHeal;
import interfaces.ISpell;

public class Cleric extends Player {


    IHeal healItem;


    public Cleric(String name, int hp, IHeal healItem) {
        super(name, hp);
        this.healItem = healItem;
    }

    public void useHealItem(Player player){
        healItem.heal(player);
    }
    public IHeal getHealItem() {
        return healItem;
    }

    public void setHealItem(IHeal healItem) {
        this.healItem = healItem;
    }
}
