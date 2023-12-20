package objects.things;

import interfaces.Sittable;
import objects.Obj;

public class Chair extends Obj implements Sittable {
    private String name;
    public Chair(String name){
        super(name);
        this.name = name;
    }
    public void bePrepared(){
        System.out.print(this.getName() + " было готово");
    }
}
