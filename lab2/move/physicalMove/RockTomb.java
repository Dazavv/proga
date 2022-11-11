package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;


public class RockTomb extends PhysicalMove { //Has a 100% chance to lower the target's Speed by one stage
    public RockTomb(){
        super(Type.ROCK, 60, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        //Effect SlowDown = new Effect().chance(1).stat(Stat.SPEED, -1);
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    public String describe(){
        return("имеет 100% вероятность понизить Скорость цели на одну ступень");
    }
}

