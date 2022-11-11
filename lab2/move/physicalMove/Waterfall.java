package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove { //Has a 20% chance to make the target flinch
    public Waterfall(){
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2) Effect.flinch(p);
    }
    @Override
    public String describe(){
        return("имеет 20% вероятность заставить противника дрогнуть");
    }
}
