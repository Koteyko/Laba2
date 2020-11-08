import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon[] p = { new Skarmory("Skarmory", 30),
                        new Helioptile("Helioptile", 30),
                        new Heliolisk("Heliolisk", 30),
                        new Oddish("Oddish", 30),
                        new Gloom("Gloom", 30),
                        new Bellossom("Bellossom", 30)};
        for (int i=0; i<6; i++) {
            if(i%2==0)b.addAlly(p[i]);
            else b.addFoe(p[i]);
        }
        b.go();
    }
}
