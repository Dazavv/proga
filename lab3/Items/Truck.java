package lab3.Items;

import lab3.interfaces.*;
import lab3.people.Person;

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
        if (obj == null || getClass() != obj.getClass()) return false;
        Truck truck = (Truck) obj;
        return Objects.equals(name, truck.name);
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, getClass());
    }
}
