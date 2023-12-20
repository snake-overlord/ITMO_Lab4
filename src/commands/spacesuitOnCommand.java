package commands;

import exceptions.SpacesuitsAreOutException;
import objects.humans.astronauts.Astronaut;
import objects.humans.astronauts.Astronauts;
import objects.things.SpacesuitBox;

import java.util.List;

public class spacesuitOnCommand implements CommandThrowsException {
    private List<Astronaut> astr;
    private SpacesuitBox suits;
    public spacesuitOnCommand(Astronauts a, SpacesuitBox box){
        this.astr = a.getArray();
        this.suits = box;
    }
    @Override
    public void execute() throws SpacesuitsAreOutException {
        System.out.print("\nКоротышки принялись надевать скафандры");
        for(Astronaut i : astr){
            i.putSpacesuitOn(suits);
            }
        }
    }

