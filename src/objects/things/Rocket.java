package objects.things;

import enums.Color;
import objects.Obj;

public class Rocket extends Obj {
    private String name;
    public Rocket(String name){
        super(name);
        this.name = name;
    }
    public void canBeBroken(){
        System.out.print(this.name + " могла быть повреждена метеорами");
    }
    public void landOnPlanet(Planet p){
        System.out.print(this.name + " опустилась на поверхность " + p.getName());
    }
    public void illuminate(Color e){
        System.out.print(this.getName()+" светилась "+e.getColor()+" цветом");
    }
}
