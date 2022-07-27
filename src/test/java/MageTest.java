import Enemy.Orc;
import Enemy.Troll;
import Player.Mage.Warlock;
import Player.Mage.Wizzard;
import Spells.FireBall;
import Spells.LightingStrike;
import creatures.Dragon;
import creatures.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Orc orc;
    Troll troll;
    Warlock warlock;
    Wizzard wizzard;
    FireBall fireBall;
    LightingStrike lightingStrike;
    Ogre ogre;
    Dragon dragon;

    @Before
    public void before(){
        orc = new Orc(200, 30);
        troll = new Troll(320 ,40);
        ogre = new Ogre(300);
        dragon = new Dragon(1000);
        fireBall = new FireBall(40);
        lightingStrike = new LightingStrike(90);
        wizzard = new Wizzard("bob",200,fireBall,dragon);
        warlock = new Warlock("betty",300, lightingStrike,ogre);

    }

    @Test
    public void testMageAttackSpell(){
        warlock.castSpell(orc);
        assertEquals(110,orc.getHp());
    }

    @Test
    public void testMageGetSpell(){
        assertEquals(fireBall,wizzard.getSpell());
    }

    @Test
    public void testMageSetSpell(){
        wizzard.setSpell(lightingStrike);
        assertEquals(lightingStrike,wizzard.getSpell());
    }

    @Test
    public void testGetCreature(){
        assertEquals(ogre,warlock.getCreature());
    }

    @Test
    public void testSetCreature(){
        warlock.setCreature(dragon);
        assertEquals(dragon,warlock.getCreature());
    }






}
