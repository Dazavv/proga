package lab4.people;

import lab4.Items.Noise;
import lab4.enums.Sounds;
import java.util.Objects;

public class Goat {
    Earth earth = new Earth();

    private String name = "Козлик";

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String sit(){
        return name + " присел";
    }
    public String grab(){
        //local class
        class WithHands{
            private String name = "руками";

            public String getName() {
                return name;
            }
        }
        WithHands withHands = new WithHands();
        return " ухватиться " + withHands.getName() + " за " + earth.name;
    }
    public String getOnAllFours(){
        return "стоять на четвереньках";
    }
    public String makeNoise(){
        //anonymous inner class
        Noise noise = new Noise(){
            @Override
            public String beHeard(String thing) {
                return " издавая " + Sounds.MOOING + " " + thing;
            }
        };
        return noise.beHeard("звуки");
    }
    public String continueAction(Object o){
        return name + " продолжал " + o;
    }

    //non-static inner classes
    public class Head{
        private String name = "голова";

        public String spinning(){
            return name + " пошла кругом";
        }
        public String getName() {
            return name;
        }
        public String setName(String name) {
            return this.name = name;
        }
    }
    public class Earth{
        private String name = "земля";

        public String getName() {
            return name;
        }
        public String setName(String name) {
            return this.name = name;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return Objects.equals(getName(), ((Goat) obj).getName()) && ((Goat) obj).earth.equals(this.earth);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getClass(), earth);
    }
    @Override
    public String toString() {
        return name;
    }
}
