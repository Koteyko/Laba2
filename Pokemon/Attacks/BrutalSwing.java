package Attacks;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove{
    public BrutalSwing(){
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return "резко разворачивается, чтобы нанести урон хвостом всему, что находится в зоне поражения";
    }
}
