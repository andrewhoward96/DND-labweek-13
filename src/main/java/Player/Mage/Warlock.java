package Player.Mage;

import interfaces.IDefend;
import interfaces.ISpell;

public class Warlock extends Mage {
    public Warlock(String name, int hp, ISpell spell, IDefend creature) {
        super(name, hp, spell, creature);
    }
}
