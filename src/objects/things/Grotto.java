package objects.things;

import interfaces.Gettable;
import objects.Obj;

public class Grotto extends Obj implements Gettable {
    private String name;
    public Grotto(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
