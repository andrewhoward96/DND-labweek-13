package creatures;

import interfaces.IDefend;

public class Ogre implements IDefend {
    private int defence;

    public Ogre(int defence){
        this.defence = defence;
    }

    @Override
    public int defend() {
        return defence;
    }

}
