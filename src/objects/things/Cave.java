package objects.things;

import interfaces.Gettable;
import objects.Obj;

public class Cave extends Obj implements Gettable {
    private String name;
    public Cave(String name){
        super(name);
        this.name = name;
    }
    public void hasExit(Planet p){
        if(p.toString().equals("Луна"))
            System.out.print(" из которой был выход на поверхность Луны");
    }
    @Override
    public String getName(){
        return name;
    }
}
