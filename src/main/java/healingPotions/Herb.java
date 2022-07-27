package healingPotions;

import Enemy.Enemy;
import Player.Player;
import interfaces.IHeal;

public class Herb implements IHeal {

    private int healValue;


    public Herb(int healValue) {
        this.healValue = healValue;
    }

    @Override
    public void heal(Player player) {
        player.restoreHp(healValue);


    }

}
