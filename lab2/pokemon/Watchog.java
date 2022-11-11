package lab2.pokemon;

import lab2.move.specialMove.ConfuseRay;
import ru.ifmo.se.pokemon.*;

public class Watchog extends Patrat {
    public Watchog(String name, int level){
        super(name, level);
        setStats(60, 85, 69, 60, 69, 77);
        setType(Type.NORMAL);
        addMove(new ConfuseRay());
    }
}
