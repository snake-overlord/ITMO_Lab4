package commands;

import objects.things.Spacesuit;

public class turnEngineOffCommand implements Command {
    private Spacesuit.Engine engine;
    public turnEngineOffCommand(Spacesuit.Engine engine){
        this.engine = engine;
    }
    @Override
    public void execute(){
        engine.stop();
    }
}
