package healingPotions;

import Player.Player;
import interfaces.IHeal;

public class Potion implements IHeal {

    private int healValue;


    public Potion(int healValue) {
        this.healValue = healValue;
    }

    @Override
    public void heal(Player player) {
        player.restoreHp(healValue);
    }
}
