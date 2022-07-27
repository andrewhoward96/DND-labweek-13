package Player.fighter;

import interfaces.IWeapon;

public class Knight extends Fighter{
    public Knight(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);
    }
    public String giveOrder(){
        return "Go forth and adventure";
    }
}
