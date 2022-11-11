package lab2;

import lab2.pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class pokemonBattle {
    public static void main(String[] args) {
        Battle field = new Battle();
        field.addAlly(new Mew("Yozh", 2));
        field.addAlly(new Patrat("Krosh", 2));
        field.addAlly(new Slaking("Nusha", 4));
        field.addFoe(new Slakoth("Kopatych", 2));
        field.addFoe(new Vigoroth("Barash", 3));
        field.addFoe(new Watchog("Pin", 3));
        field.go();
    }
}
