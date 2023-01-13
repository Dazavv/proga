package lab3.people;

import lab3.Items.Cold;
import lab3.Items.Fence;
import lab3.interfaces.Felt;

public class Neznaika extends Person implements Felt {
    Cold cold = new Cold();
    Fence fence = new Fence();
    public Neznaika(String name){
        super(name);
    }
    @Override
    public String see(String n){
        return " увидел";
    }
    public String feelCold(){
        return "у " + getName() + " " + cold.runDownBack();
    }

    public String remember(String thing) {
        return " вспомнились " + thing;
    }
    public String getScared(){
        return "оторопев от испуга ";
    }
    public String slipOff(){
        return " соскользнуть с " + fence.getName();
    }
    @Override
    public String feel(Object o){
        return "чуя " + o;
    }
    public String run(){
        return " побежал ";
    }
}
