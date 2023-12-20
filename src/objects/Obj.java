package objects;

import java.util.Objects;

public abstract class Obj {
    protected String name;
    public Obj(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj object = (Obj) o;
        return this.name.equals(object.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    private static void secretInfo(){
        System.out.print( "звук не распространяется в безвоздушной среде");
    }
}
