package objects.humans.astronauts;

import exceptions.SpacesuitsAreOutException;
import commands.turnEngineOnCommand;
import objects.humans.Human;
import objects.things.Spacesuit;
import objects.things.SpacesuitBox;

public abstract class Astronaut extends Human {
    private String name;
    private Spacesuit suit;
    private boolean isSuitOn = false;
    private boolean isTiedToCord;
    private turnEngineOnCommand turnOnCommand;
    private turnEngineOnCommand turnOffCommand;
    public Astronaut(String name){
        super(name);
        this.name = name;
    }
    public void tieToCord(){
        this.isTiedToCord = true;
    }
    public void turnEngineOn(turnEngineOnCommand command){
        command.execute();
        System.out.print(this.getName() + " нажал кнопку электродвигателя, который был прикреплён к скафандру у него за спиной");
    }
    public void stayHere(){
    }
    public void mineCrystals(){
    }
    public void putSpacesuitOn(SpacesuitBox box) throws SpacesuitsAreOutException {
        if (!box.getArray().isEmpty()){
            this.suit = box.getArray().get(0);
            box.removeSuit(0);
            this.isSuitOn = true;
        }
        else {
            throw new SpacesuitsAreOutException("Скафандры закончились!");
        }
    }
    public static void canControlFlight(){
        System.out.print("Придавая своему телу то или иное положение в пространстве, космонавт мог направлять свой полет в любую сторону");
    }
    public Spacesuit getSuit(){
        return suit;
    }

    public boolean isSuitOn() {
        return isSuitOn;
    }

    public boolean isTiedToCord() {
        return isTiedToCord;
    }
}
