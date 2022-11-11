package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 60, 999999999);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.EVASION, 0);
    }
    @Override
    public String describe(){
        return("не промахивается");
    }
}
