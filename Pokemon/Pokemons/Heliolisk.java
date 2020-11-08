package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Heliolisk extends Helioptile{
    public Heliolisk(String name, int level){
        super(name, level);
        setStats(62, 55, 52, 109, 94, 109);
        setMove(new BrutalSwing());
    }
}
