package creatures;

import interfaces.IDefend;

public class Dragon implements IDefend {

    private int defence;


    public Dragon(int defence){
        this.defence = defence;
    }

    @Override
    public int defend() {
        return defence;
    }
}
