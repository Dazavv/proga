package lab2.move.physicalMove;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.1) p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    public String describe(){
        return("имеет 10% вероятность повысить свою Защиту на одну ступень");
    }
}
