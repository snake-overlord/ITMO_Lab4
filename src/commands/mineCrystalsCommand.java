package commands;

import objects.humans.astronauts.Astronaut;
import objects.humans.astronauts.Astronauts;

public class mineCrystalsCommand implements Command {
    private Astronauts astr;
    public mineCrystalsCommand(Astronauts a){
        this.astr = a;
    }
    @Override
    public void execute(){
        System.out.print("Космонавты принялись за добычу кристаллов");
        astr.getArray().forEach(Astronaut::mineCrystals);
    }
}
