package lab4.Items;

import java.util.Objects;

public class Thought {
    private String name = "мысль";

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
        Thought thought = (Thought) obj;
        return Objects.equals(name, thought.name);
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
