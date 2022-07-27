package Player.fighter;

import interfaces.IWeapon;

public class Dwarf extends Fighter {

    private int hunger;
    public Dwarf(String name, int hp, IWeapon weapon, int hunger) {
        super(name, hp, weapon);
        this.hunger = hunger;
    }

    public int getHunger(){
        return hunger;
    }
    public void feedDwarf(int food){
        hunger -= food;
    }
    public  void starvingDwarf(int noFood){
        hunger += noFood;
    }

}
