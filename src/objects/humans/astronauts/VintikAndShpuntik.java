package objects.humans.astronauts;

import interfaces.Giveable;
import objects.humans.Human;

public class VintikAndShpuntik extends Astronaut {
    private String name;
    public VintikAndShpuntik(String name){
        super(name);
        this.name = name;
    }
    public void giveRover(Human h){
        Giveable rover = () -> "вездеход";
        System.out.print(this.getName() + " подарили ему свой " + rover.getName());
    }

}
