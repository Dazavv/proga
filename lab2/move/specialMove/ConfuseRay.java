package lab2.move.specialMove;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends SpecialMove {
    public ConfuseRay(){
        super(Type.GHOST, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);

    }
    @Override
    public String describe(){
        return("вводит цель в замешательство");
    }
}
