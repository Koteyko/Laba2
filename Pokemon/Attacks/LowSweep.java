package Attacks;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove{
    public LowSweep(){
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
}
