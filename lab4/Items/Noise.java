package lab4.Items;

import java.util.Objects;

public class Noise {
    private String name = "шум";

    public String beHeard(String thing){
        return " послышался " + getName() + " " + thing;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Noise noise = (Noise) obj;
        return Objects.equals(name, noise.name);
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
