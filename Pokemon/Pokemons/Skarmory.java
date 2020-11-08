package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Skarmory extends Pokemon {
    public Skarmory(String name, int level){
        super(name, level);
        setStats(65, 80, 140, 40, 70, 70);
        setType(Type.STEEL, Type.FLYING);
        setMove(new AirSlash(), new Slash(), new MetalClaw(), new Peck());
    }
}
