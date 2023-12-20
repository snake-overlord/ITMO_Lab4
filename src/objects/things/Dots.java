package objects.things;

import interfaces.Turnable;
import objects.Obj;

public class Dots extends Obj implements Turnable {
    private String name;
    public Dots(String name){
        super(name);
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
