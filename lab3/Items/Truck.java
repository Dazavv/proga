package lab3.Items;

import lab3.interfaces.*;

public class Truck implements Motor, TruckBody{
    Noise noise = new Noise();
    private String name = "грузовая машина";

    public String pullUp(){
        return " подкатила " + getName();
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
}
