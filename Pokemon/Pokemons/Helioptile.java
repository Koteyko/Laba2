package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Helioptile extends Pokemon{
    public Helioptile(String name, int level){
        super(name, level);
        setStats(44, 38, 33, 61, 43, 70);
        setType(Type.ELECTRIC, Type.NORMAL);
        setMove(new LowSweep(), new ChargeBeam(), new DarkPulse());
    }
}
