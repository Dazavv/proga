package lab2.pokemon;

import lab2.move.physicalMove.Slash;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Slakoth{
    public Vigoroth(String name, int level){
        super(name, level);
        setStats(80, 80, 80, 55, 55, 90);
        setType(Type.NORMAL);
        addMove(new Slash());
    }
}

