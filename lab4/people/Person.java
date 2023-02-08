package lab4.people;

import java.util.Objects;

public abstract class Person {
    private String name;

    public Person(String n){
        this.name = n;
    }
    public abstract String see(String n);

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name);
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
