package Player.Mage;

import interfaces.IDefend;
import interfaces.ISpell;

public class Wizzard extends  Mage {
    public Wizzard(String name, int hp, ISpell spell, IDefend creature) {
        super(name, hp, spell, creature);
    }
}
