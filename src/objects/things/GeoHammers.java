package objects.things;

import interfaces.Attachable;
import objects.Obj;

public class GeoHammers extends Obj implements Attachable {
    private String name;
    public GeoHammers(String name){
        super(name);
        this.name = name;
    }
    public void bangOnTheRocks(){
        System.out.print(this.name + " застучали о скалы, но звука не было слышно");
    }
}
