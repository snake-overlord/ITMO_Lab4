package objects.things;

import interfaces.Attachable;
import objects.Obj;

public class Alpenstocks extends Obj implements Attachable {
    private String name;
    public Alpenstocks(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
