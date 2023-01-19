package lab3.Items;

import lab3.people.Person;

import java.util.Objects;

public class Cold {
    private String name = "холод";

    public String runDownBack(){
        return name + " пробежал по спине";
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
        Cold cold = (Cold) obj;
        return Objects.equals(name, cold.name);
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
