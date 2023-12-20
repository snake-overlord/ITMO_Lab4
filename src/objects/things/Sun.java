package objects.things;

import objects.Obj;

public class Sun extends Obj {
    private String name;
    public Sun(String name){
        super(name);
        this.name = name;
    }
    public void lightFromSide(Planet p){
        System.out.print(this.name + " освещает " + p.getName() + " не прямыми, а боковыми лучами");
    }
    public void lightDirectly(Planet p){
        System.out.print(this.name + " освещает " + p.getName() + " прямыми лучами");
    }
}
