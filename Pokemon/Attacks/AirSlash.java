package Attacks;

import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove{
    public AirSlash(){
        super(Type.FLYING, 75,95);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.3);
        if(e.success()) e.flinch(p);
    }
}
