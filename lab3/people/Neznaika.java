package lab3.people;

import lab3.Items.*;
import lab3.interfaces.Felt;
import java.util.Objects;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return getName().equals(((Neznaika) obj).getName()) && ((Neznaika) obj).cold.equals(this.cold) && ((Neznaika) obj).fence.equals(this.fence);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getClass(), cold, fence);
    }
    @Override
    public String toString(){
        return getName();
    }
}
