package lab2.move.specialMove;

import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove { //User sleeps for two turns, completely healing itself
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect Sleep = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.setCondition(Sleep);
    }

    @Override
    public String describe(){
        return("полностью вылечивает себя и засыпает на два хода");
    }
}
