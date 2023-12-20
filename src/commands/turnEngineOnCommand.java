package commands;

import objects.things.Spacesuit;

public class turnEngineOnCommand implements Command {
    private Spacesuit.Engine engine;
    public turnEngineOnCommand(Spacesuit.Engine engine){
        this.engine = engine;
    }
    @Override
    public void execute(){
        engine.start();
    }

}
