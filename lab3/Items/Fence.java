package lab3.Items;

import lab3.people.Person;

import java.util.Objects;

public class Fence {
    private String name = "забор";

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
        Fence fence = (Fence) obj;
        return Objects.equals(name, fence.name);
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
