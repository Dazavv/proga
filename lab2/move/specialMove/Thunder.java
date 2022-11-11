package lab2.move.specialMove;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){ //Has a 30% chance to paralyze the target
        super(Type.ELECTRIC, 110, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.paralyze(p);
        }
    }
    @Override
    public String describe(){
        return("имеет 30% шанс парализовать цель");
    }
}
