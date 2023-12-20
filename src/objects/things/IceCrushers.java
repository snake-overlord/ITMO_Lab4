package objects.things;

import interfaces.Armable;
import interfaces.Attachable;
import objects.Obj;

public class IceCrushers extends Obj implements Armable, Attachable {
    private String name;
    public IceCrushers(String name){
        super(name);
        this.name = name;
    }
    public void bangOnTheRocks(Planet p){
        if(p.toString().equals("Земля"))
            System.out.print(this.name + " громко застучали о скалы");
        else
            System.out.print(this.name + " застучали о скалы, но стука не было слышно, поскольку звук не распространяется в безвоздушной среде");
    }
    @Override
    public String getName(){
        return this.name;
    }
}