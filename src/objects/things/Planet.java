package objects.things;

import enums.Color;
import objects.Obj;

public abstract class Planet extends Obj {
    private String name;
    private final int radius;

    public Planet(String name, int radius) {
        super(name);
        this.name = name;
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void seemedFrom(Planet o){
        if(this.radius>o.getRadius())
            System.out.print(o.getName() + " с " + this.getName() + " кажется нам размером с небольшую тарелку");
        else
            System.out.print(o.getName() + " с " + this.getName() + " выглядит как большой круглый поднос");
    }
    public void beDarkAtNight(){
        System.out.print("ночью на " + this.getName() + " темно и ничего не видно");
    }
    public void lightPlanet(Planet o){
        System.out.print(this.name + " освещает " + o.getName());
    }
    public void seenAs(boolean isFull){
        if(isFull)
            System.out.print(this.getName() + " была видна не в форме серпа или полумесяца, а в виде полного круга");
        else
            System.out.print(this.getName() + " была видна в форме серпа или полумесяца, а не в виде полного круга");
    }
    public void reflectLight(Planet o){
        if(this.radius>o.getRadius())
            System.out.print("так как " + this.name + " больше " + o.getName() + ", света от него получается больше, поэтому " +
                    "с той части " + o.getName() + ", с которой видна "  + this.name + " ночью можно свободно читать, и писать, и рисовать, и заниматься разными другими делами");
        else
            System.out.print("так как " + this.name + " меньше " + o.getName() + ", света от него получается меньше, поэтому " +
                    "с той части " + o.getName() + ", с которой видна "  + this.name + " ночью нельзя ни читать, ни писать, ни рисовать, ни заниматься разными другими делами");
    }
    public void beColorful(Color light, Color dark) {
        System.out.print("Поверхность " + this.getName() + " была " + light.getColor() + " цвета, а всё, что оставалось в тени, было "+ dark.getColor());
    }
    public static class Earth extends Planet {
        public Earth(String name){
            super(name, 6378);
        }
    }
    public static class Moon extends Planet {
        public Moon(String name){
            super(name, 1737);
        }
        public void hasLuminousSurface(){
            System.out.print("поверхность " + this.getName() + " обладает способностью светиться под воздействием невидимых космических лучей");
        }
    }

}