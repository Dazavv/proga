package lab4.people;

import lab4.Items.*;
import lab4.enums.State;
import java.util.Objects;

public class Shorties extends Person{

    Truck truck = new Truck();
    Wool wool = new Wool();

    public Shorties(String name){
        super(name);
    }
    @Override
    public String see(String n){
        return " увидел";
    }
    public String leaveHaircut(){
        return getName() + " оставили стрижку ";
    }
    public String startShipping(){
        return " принялись грузить " + wool.getName() + truck.beUploaded();
    }
    public String beHappened(Object place){
        return "делается с " + State.POOR + " " + getName() + " на " + place;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((Shorties) obj).getName()) && ((Shorties) obj).truck.equals(this.truck) && ((Shorties) obj).wool.equals(this.wool);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getClass(), truck, wool);
    }
    @Override
    public String toString(){
        return getName();
    }

}
