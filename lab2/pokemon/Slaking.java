package lab2.pokemon;

import lab2.move.physicalMove.AerialAce;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Vigoroth {
    public Slaking(String name, int level){
        super(name, level);
        setStats(150, 160, 100, 95, 65, 100);
        setType(Type.NORMAL);
        addMove(new AerialAce());
    }
}
