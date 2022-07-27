package Player.fighter;

import interfaces.IWeapon;


public class Barb extends Fighter{
    public Barb(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);

    }

    public void rage(){
        super.reduceHp(10);
    }
}
