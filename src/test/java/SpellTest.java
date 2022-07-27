import Spells.FireBall;
import Spells.LightingStrike;
import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Orc orc;
    FireBall fireBall;
    LightingStrike lightingStrike;

    @Before
    public void before(){
        orc = new Orc(100,50);
        fireBall = new FireBall(50);
        lightingStrike = new LightingStrike(60);
    }

    @Test
    public void testFireBallCast(){
        fireBall.castSpell(orc);
        assertEquals(50,orc.getHp());
    }

    @Test
    public void  testLightingStrike(){
        lightingStrike.castSpell(orc);
        assertEquals(40,orc.getHp());
    }


}
