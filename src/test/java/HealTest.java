import Player.Mage.Warlock;
import Player.fighter.Knight;
import Weapons.Axe;
import healingPotions.Herb;
import healingPotions.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealTest {

    Knight knight;
    Axe axe;

    Potion potion;
    Herb herb;

    @Before
    public void before(){
        axe = new Axe(20);
        knight = new Knight("Bob",150,axe);
        potion = new Potion(30);
        herb = new Herb(50);

    }

    @Test
    public void testUsePotion(){
        potion.heal(knight);
        assertEquals(180,knight.getHp());
    }
    @Test
    public void testUseHerb(){
        herb.heal(knight);
        assertEquals(200,knight.getHp());
    }




}
