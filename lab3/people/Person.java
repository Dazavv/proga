package lab3.people;

import java.util.Objects;

public abstract class Person {
    private String name;

    public Person(String n){
        this.name = n;
    }
    public String see(String n){
        if (n == null){
            return name + " увидел";
        }
        return name + " увидел " + n;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) {
            return true;
        }
        if (otherObject.getClass() != this.getClass()) {
            return false;
        }
        Person otherPerson = (Person) otherObject;
        return name.equals(otherPerson.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, getClass());
    }
}
