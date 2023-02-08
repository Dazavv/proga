package lab4.people;

import lab4.enums.Mood;
import lab4.exceptions.WrongMoodException;

public class Driver extends Person {
    public Driver(String name) {
        super(name);
    }

    public void waveHand(Mood mood) throws WrongMoodException {
        if (mood.toString().equals("весело")) {
            System.out.println(mood + " замахал рукой");
        }
        else{throw new WrongMoodException("The story is incorrect. Please change to \"JOYFULLY\"");
        }
    }
    @Override
    public String see(String n) {
        return getName() + " увидел " + n;
    }
}
