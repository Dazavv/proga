package lab2.pokemon;

import lab2.move.physicalMove.Bite;
import lab2.move.specialMove.Rest;
import lab2.move.statusMove.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Patrat extends Pokemon{
    public Patrat(String name, int level){
        super(name, level);
        setStats(45, 55, 39, 35, 39, 42);
        setType(Type.NORMAL);
        setMove(new Bite(), new WorkUp(), new Rest());
    }
}
