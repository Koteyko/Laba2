package Attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove{
    public PoisonPowder(){
        super(Type.POISON, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.poison(p);
    }
}
