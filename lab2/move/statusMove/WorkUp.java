package lab2.move.statusMove;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1); 
        p.setMod(Stat.SPECIAL_ATTACK, 1);

    }
    @Override
    public String describe(){
        return("повышает Атаку и Спец. Атаку на одну ступень каждую");
    }
}
