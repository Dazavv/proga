package lab3.Items;

import lab3.people.Person;

import java.util.Objects;

public class Stack {
    private String name = "куча";

    public String beWooly(){
        return "шерстянная " + name;
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
        Stack stack = (Stack) obj;
        return Objects.equals(name, stack.name);
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
