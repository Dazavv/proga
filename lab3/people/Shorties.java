package lab3.people;

import lab3.Items.Truck;
import lab3.Items.Wool;
import lab3.enums.State;

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

}