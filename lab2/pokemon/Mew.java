package lab2.pokemon;

import lab2.move.physicalMove.AerialAce;
import lab2.move.physicalMove.RockTomb;
import lab2.move.physicalMove.SteelWing;
import lab2.move.physicalMove.Waterfall;
import ru.ifmo.se.pokemon.*;

public class Mew extends Pokemon {
    public Mew(String name, int level) {
        super(name, level);
        setStats(100, 100, 100, 100, 100, 100);
        setType(Type.PSYCHIC);
        setMove(new RockTomb(), new Waterfall(), new AerialAce(), new SteelWing());
    }
}
