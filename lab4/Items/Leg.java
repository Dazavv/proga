package lab4.Items;

import java.util.Objects;

public class Leg {
    private String name = "нога";

    public String getName(){
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Leg leg = (Leg) obj;
        return Objects.equals(name, leg.name);
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
