package objects.things;

import interfaces.Gettable;
import objects.Obj;

public class Tunnel extends Obj implements Gettable {
    private String name;
    public Tunnel(String name){
        super(name);
        this.name = name;
    }
    public void setPlace(Planet p){
        if(p.toString().equals("Луна"))
            this.name = super.name + " в оболочке Луны";
    }
    @Override
    public String getName(){
        return name;
    }
}
