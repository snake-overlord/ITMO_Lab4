package commands;

import objects.humans.astronauts.Astronaut;
import objects.humans.astronauts.Astronauts;

import java.util.List;

public class tieToCordCommand implements Command {
    private List<Astronaut> astr;

    public tieToCordCommand(Astronauts a) {
        this.astr = a.getArray();
    }
    @Override
    public void execute(){
        astr.forEach(Astronaut::tieToCord);
        System.out.print("\nВсе тотчас выполнили приказание.");
    }
}

