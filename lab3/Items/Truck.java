package lab3.Items;

import lab3.interfaces.*;
import lab3.people.Neznaika;

import java.util.Objects;

public class Truck implements Motor, TruckBody{
    Noise noise = new Noise();
    private String name = "грузовая машина";

    public String pullUp(Object o){
        return name + " подкатила к " + o;
    }
    @Override
    public String makeNoise(){
        return noise.beHeard(motor);
    }
    @Override
    public String beUploaded(){
        return " в " + truckBody;
    }
    public String getName() {
        return name;
    }
    public String setName(String name) {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return getName().equals(((Truck) obj).getName()) && ((Truck) obj).noise.equals(this.noise);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getClass(), noise);
    }
    @Override
    public String toString(){
        return getName();
    }
}
