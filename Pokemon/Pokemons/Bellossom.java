package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Bellossom extends Gloom{
    public Bellossom(String name, int level){
        super(name, level);
        setStats(75, 80, 95, 90, 100, 50);
        setType(Type.GRASS);
        setMove(new MagicalLeaf());
    }
}
