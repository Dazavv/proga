package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove { //Has an increased chance for a critical hit
    public Slash(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (Math.random() < 0.125){
            return 2;
        }
        else {
            return 1;
        }
    }
    @Override
    public String describe(){
        return("имеет повышенный шанс критического удара");
    }
}
