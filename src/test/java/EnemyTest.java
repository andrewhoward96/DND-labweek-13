import Enemy.Orc;
import Enemy.Troll;
import Player.Mage.Wizzard;
import Player.fighter.Dwarf;
import Player.fighter.Fighter;
import Spells.FireBall;
import Weapons.Sword;
import creatures.Ogre;
import interfaces.ISpell;
import interfaces.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Orc orc;

    Wizzard wizzard;

    FireBall fireBall;

    Ogre ogre;

    Troll troll;
    Dwarf dwarf;

    Sword sword;

    @Before
    public void before(){
        orc = new Orc(100, 20);
        troll = new Troll(100,70);
        sword = new Sword(10);
        ogre = new Ogre(10);
        fireBall = new FireBall(20);
        wizzard = new Wizzard("bob", 200, fireBall,ogre);

        dwarf = new Dwarf("bob",250,sword,10);
    }

    @Test
    public void testOrcGetHp(){
        assertEquals(100,orc.getHp());
    }

    @Test
    public void testOrcTakeDmg(){
        orc.takeDmg(50);
        assertEquals(50,orc.getHp());
    }
    @Test
    public void testTrollGetHp(){
        assertEquals(100,troll.getHp());
    }

    @Test
    public void testTrollTakeDmg(){
        troll.takeDmg(50);
        assertEquals(50,troll.getHp());
    }

    @Test
    public void testEnemyAttack(){
        troll.attack(dwarf);
        assertEquals(180,dwarf.getHp());
    }

    @Test
    public void testMageAttack(){
        orc.attack(wizzard);
        assertEquals(190,wizzard.getHp());
    }





}
