package lab4.people;

import lab4.Items.*;
import lab4.exceptions.WrongPlaceException;
import lab4.interfaces.Felt;
import java.util.Objects;

public class Neznaika extends Person implements Felt {
    Cold cold = new Cold();
    Fence fence = new Fence();
    public Neznaika(String name){
        super(name);
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
        return " соскользнуть с " + fence;
    }

    public String run(){
        return " побежал ";
    }
    public String gettingUncomfortable(Object o){
        return "От " + o + " " + getName() + " стало не по себе ";
    }
    public String grab(String thing){
        return " схватил за " + Scruff.name + thing;
    }
    public void pullOff(String place) throws WrongPlaceException {
        if (place.equals("карусель") || place.equals("карусели")) {
        System.out.print(" стащил с " + place);
        }
        else {throw new WrongPlaceException("\"" + place + "\"" + " is the wrong place");
        }
    }
    public String drag(Object o){
        return getName() + " тащил за " + Scruff.name + " " + o;
    }
    @Override
    public String see(String n){
        if (n.equals(Nobody.name)){
            return getName() + " увидел, что " + Nobody.NotListening();
        }
        else{
            return getName() + " увидел ";
        }
    }
    @Override
    public String feel(Object o){
        return "чуя " + o;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((Neznaika) obj).getName()) && ((Neznaika) obj).cold.equals(this.cold) && ((Neznaika) obj).fence.equals(this.fence);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getClass(), cold, fence, Scruff.name);
    }
    @Override
    public String toString(){
        return getName();
    }
    // static nested classes
    static class Scruff{
        private static String name = "шиворот ";

        public static String getName() {
            return name;
        }
    }
    static class Nobody{
        private static String name = "никто";

        public static String getName() {
            return name;
        }
        public static String NotListening(){
            return name + " не слушает ";
        }
    }


}

