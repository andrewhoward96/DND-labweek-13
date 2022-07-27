import Enemy.Orc;
import Enemy.Troll;
import Player.fighter.Barb;
import Player.fighter.Dwarf;
import Player.fighter.Knight;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FighterTest {

    Barb barb;

    Dwarf dwarf;

    Knight knight;
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
        knight = new Knight("Bob",150,axe);
        dwarf = new Dwarf("ian", 200,club, 80);
        barb = new Barb("lou", 250,sword);
    }

    @Test
    public void testKnightAttack(){
        knight.attack(orc);
        assertEquals(80,orc.getHp());
    }
    @Test
    public void testDwarfAttack(){
        dwarf.attack(troll);
        assertEquals(70,troll.getHp());
    }
    @Test
    public void testBarbAttack(){
        barb.attack(orc);
        assertEquals(60,orc.getHp());
    }

    @Test
    public void testKnightGetWeapon(){
       assertEquals(axe,knight.getWeapon());
    }

    @Test
    public void testDwarfGetWeapon(){
        assertEquals(club,dwarf.getWeapon());
    }
    @Test
    public void testBarbGetWeapon(){
        assertEquals(sword,barb.getWeapon());
    }

    @Test
    public void testSetWeapon(){
        knight.setWeapon(sword);
        assertEquals(sword,knight.getWeapon());
    }

    @Test
    public void testKnightGiveOrder(){
        assertEquals("Go forth and adventure", knight.giveOrder());
    }

    @Test
    public void testDwarfGetHunger(){
        assertEquals(80,dwarf.getHunger());
    }

    @Test
    public void testDwarfFeed(){
        dwarf.feedDwarf(40);
        assertEquals(40,dwarf.getHunger());
    }
    @Test
    public void testDwarfStarving(){
        dwarf.starvingDwarf(60);
        assertEquals(140,dwarf.getHunger());
    }
    @Test
    public void testBarbRage(){
        barb.rage();
        assertEquals(240,barb.getHp());
    }

}
