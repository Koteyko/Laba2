package Attacks;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove{
    public StunSpore(){
        super(Type.GRASS, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "распыляет парализующую пыльцу, которая может отравить врага";
    }
}
