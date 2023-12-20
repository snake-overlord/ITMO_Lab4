package objects.things;

import objects.Obj;

public class Air extends Obj {
    private final String name;
    public Air(String name){
        super(name);
        this.name = name;
    }
    public void wasThin(){
        System.out.print(this.name + " был крайне разрежен");
    }
}
