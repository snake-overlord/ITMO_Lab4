package commands;

import objects.humans.astronauts.Astronaut;
import objects.humans.astronauts.Astronauts;

public class stayHereCommand implements Command {
    private Astronauts astr;
    public stayHereCommand(Astronauts astr){
        this.astr = astr;
    }
    @Override
    public void execute(){
        astr.getArray().forEach(Astronaut::stayHere);
    }
}
