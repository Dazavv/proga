package lab3;

import lab3.Items.*;
import lab3.enums.*;
import lab3.people.*;

public class Story {
    public static void main(String[] args) {

        Neznaika neznaika = new Neznaika("Незнайка");
        Driver driver = new Driver("Шофер");
        Shorties shorties = new Shorties("Коротышки");
        Truck truck = new Truck();
        Stack stack = new Stack();
        WackyIsland wackyIsland = new WackyIsland();
        Leg legs = new Leg();

        System.out.print(Time.AT_THIS_TIME + truck.makeNoise() + " " + neznaika.see(null) + ", что " + truck.pullUp(stack.beWooly()) + "\n"
                + shorties.leaveHaircut() + "и" + shorties.startShipping() + "\n"
                + driver.see("Незнайка") + " и " + driver.waveHand(Mood.JOYFULLY) + "\n"
                + "От этого смеха " + neznaika.feelCold() + "\n"
                + Time.INSTANTLY + " " + neznaika.setName("ему") + neznaika.remember("рассказы") + " о том, что " + shorties.beHappened(wackyIsland.getName()) + "\n"
                + neznaika.getScared() + neznaika.setName("он") + neznaika.slipOff() + " не " + neznaika.feel(legs.setName("ног")) + neznaika.run() + Direction.BACK);
    }
}
