package lab4;

import lab4.Items.*;
import lab4.exceptions.WrongMoodException;
import lab4.exceptions.WrongPlaceException;
import lab4.people.*;
import static lab4.enums.Direction.BACK;
import static lab4.enums.Mood.JOYFULLY;
import static lab4.enums.Time.AT_THIS_TIME;
import static lab4.enums.Time.INSTANTLY;
public class Story {
    public static void main(String[] args) {

        Neznaika neznaika = new Neznaika("Незнайка");
        Driver driver = new Driver("Шофер");
        Shorties shorties = new Shorties("Коротышки");
        Goat goat = new Goat();

        Truck truck = new Truck();
        Stack stack = new Stack();
        WackyIsland wackyIsland = new WackyIsland();
        Leg legs = new Leg();
        Thought thought = new Thought();
        Goat.Head head = goat.new Head();

        System.out.print(neznaika.gettingUncomfortable(thought) + "\n"
                + AT_THIS_TIME + truck.makeNoise() + " " + neznaika.see("") + ", что " + truck.pullUp(stack.beWooly()) + "\n"
                + shorties.leaveHaircut() + "и" + shorties.startShipping() + "\n"
                + driver.see("Незнайка") + " и ");

        try {
            driver.waveHand(JOYFULLY);
        } catch (WrongMoodException e) {
            System.err.println("\n" + e.getMessage());
        }

        System.out.print("От этого смеха " + neznaika.feelCold() + "\n"
                + INSTANTLY + " " + neznaika.setName("ему") + neznaika.remember("рассказы") + " о том, что " + shorties.beHappened(wackyIsland) + "\n"
                + neznaika.getScared() + neznaika.setName("он") + neznaika.slipOff() + " не " + neznaika.feel(legs.setName("ног")) + neznaika.run() + BACK + "\n"
                + neznaika.see("никто") + neznaika.setName("Незнайка") + neznaika.grab("Козлика") + " и");

        try {
            neznaika.pullOff("карусели");
        } catch (WrongPlaceException e) {
            System.err.println("\n" + e.getMessage());
        }

        System.out.println("\nу бедняги " + goat + " " + head.spinning() + goat.makeNoise() + ", " + goat.sit() + goat.grab() + "\n"
                + neznaika.drag(goat) + ", " + goat.continueAction(goat.getOnAllFours()) + goat.makeNoise());
    }
}
