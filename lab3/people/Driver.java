package lab3.people;

import lab3.enums.Mood;


public class Driver extends Person{
    public Driver(String name){
        super(name);
    }
    public String waveHand(Mood mood){
        if(mood.toString().equals("весело")){
            return mood + " замахал рукой";
        }
        return "";
    }
}
