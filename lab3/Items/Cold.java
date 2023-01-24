package lab3.Items;

import java.util.Objects;

public class Cold {
    private String name = "холод";

    public String runDownBack(){
        return name + " пробежал по спине";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cold cold = (Cold) obj;
        return name.equals(cold.name);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
