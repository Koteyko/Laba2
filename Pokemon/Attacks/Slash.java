package Attacks;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return (Math.random() <= 0.125 ? 2 : 1);
    }
}
