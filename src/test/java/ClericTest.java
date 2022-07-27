import Player.Healer.Cleric;
import Player.fighter.Dwarf;
import Weapons.Axe;
import healingPotions.Herb;
import healingPotions.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric1;
    Cleric cleric2;

    Dwarf dwarf;
    Axe axe;
    Potion potion;
    Herb herb;

    @Before
    public void before(){
        axe = new Axe(20);
        potion = new Potion(50);
        herb = new Herb(30);
        dwarf = new Dwarf("bob",10,axe,30);
        cleric1 = new Cleric("bill",30,herb);
        cleric2 = new Cleric("sam",50,potion);
    }
    @Test
    public void testGetHealingItem(){
        assertEquals(herb,cleric1.getHealItem());
    }
    @Test
    public void testSetHealingItem(){
        cleric1.setHealItem(potion);
        assertEquals(potion,cleric1.getHealItem());
    }

    @Test
    public void testHerbHeal(){
        cleric1.useHealItem(dwarf);
        assertEquals(40,dwarf.getHp());
    }

    @Test
    public void testPotionHeal(){
        cleric2.useHealItem(dwarf);
        assertEquals(60,dwarf.getHp());
    }
}
