package lab3.Items;

import lab3.interfaces.Motor;

public class Noise {
    private String name = "шум";

    public String beHeard(String thing){
        return " послышался " + getName() + " " + thing;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return name;
    }
}
