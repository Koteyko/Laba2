package Attacks;

import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.GRASS, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }
}