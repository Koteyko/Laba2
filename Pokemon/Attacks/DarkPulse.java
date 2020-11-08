package Attacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove{
    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2);
        if(e.success()) e.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует ауру ужаса, пронизанную тёмными мыслями. Может заставить врага дрогнуть";
    }
}
