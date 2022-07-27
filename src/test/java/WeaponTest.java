import Enemy.Orc;
import Enemy.Troll;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Axe axe;
    Club club;
    Sword sword;
    Orc orc;
    Troll troll;

    @Before
    public void before(){
        axe = new Axe(20);
        club = new Club(30);
        sword = new Sword(40);
        orc = new Orc(100,200);
        troll = new Troll(100,300);
    }

    @Test
    public void testAxeAttack(){
        axe.attackEnemy(orc);
        assertEquals(80,orc.getHp());
    }
    @Test
    public void testClubAttack(){
        club.attackEnemy(troll);
        assertEquals(70,troll.getHp());
    }
    @Test
    public void testSwordAttack(){
        sword.attackEnemy(orc);
        assertEquals(60,orc.getHp());
    }

}
