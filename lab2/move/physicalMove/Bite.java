package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;
public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }
    @Override
    public String describe(){
            return("имеет 30% вероятность заставить цель дрогнуть");
    }

}
