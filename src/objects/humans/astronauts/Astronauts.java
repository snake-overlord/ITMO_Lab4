package objects.humans.astronauts;

import enums.*;
import interfaces.*;
import objects.humans.Human;
import objects.humans.IfManaged;

import java.util.ArrayList;
import java.util.List;

public class Astronauts extends Human implements Visible {
    private String name;
    private List<Astronaut> astronauts;
    public Astronauts(String name, Astronaut ... astr){
        super(name);
        this.name = name;
        this.astronauts = new ArrayList<>(List.of(astr));
    }

    public List<Astronaut> getArray(){
        return this.astronauts;
    }
    public void addAstronaut(Astronaut a){
        astronauts.add(a);
    }
    public String crewNames(){
        StringBuilder names = new StringBuilder();
        for(Astronaut a : this.getArray()){
            names.append(a.getName()).append(", ");
        }
        return names.toString();
    }

    public void turnInto(Turnable t){
        System.out.print(this.getName()+" превратились в " + t.getName());
    }
    public void attachSth(Attachable ... att){
        System.out.print(this.getName() + " прикрепили к поясам ");
        for(Attachable a : att){
            System.out.print(a.getName() + ", ");
        }
    }
    public void getThrough(Gettable g, Time time, HowToAct adv){
        System.out.print(this.getName() + time.getTime() + adv.getAdv() + " пробирались по " + g.getName());
    }
    public void riseUpTogether(){
        System.out.print(this.getName() + " длинной вереницей поднялись в воздух");
    }
    public void arm(Armable arm){
        System.out.print(this.getName()+ " вооружились " + arm.getName());
    }
    public void overcome(IfManaged i){
        if(i==IfManaged.MANAGED)
            System.out.print("им удалось преодолеть все препятствия" );
        else
            System.out.print("им не удалось преодолеть все препятствия" );
    }
    public void mustCheckMechanisms(){
        System.out.print("в космический полёт невозможно было отправляться без тщательнейшей проверки всех приборов и механизмов");
    }
    public void getTo(IfManaged i, Gettable g){
        if(i==IfManaged.MANAGED)
            System.out.print(this.getName() + " удалось пробраться в " + g.getName());
        else
            System.out.print(this.getName() + " не удалось пробраться в " + g.getName());
    }
    public void riseUp(HowToAct act){
        System.out.print(this.getName()+" "+act.getAdv()+" поднимались кверху");
    }
    public void lineInAChain(){
        System.out.print("выстроились в цепочку");
    }
    public void watchTwoColors(Color firstColor, Color secondColor){
        System.out.print("Куда бы " + this.getName() + " ни обратили свой взор, они везде наблюдали как бы борьбу двух цветов: " + firstColor.getColor() + " и " + secondColor.getColor());
    }
    public void seeSky(Color color){
        Visible sky = new Visible(){
            public String getName(){
                return "небо с мириадами звёзд";
            }
        };
        System.out.print(this.getName() + " увидели над собой " + color.getColor() + " " + sky.getName());
    }
    public void seeDisk(Color color){
        Visible disk = new Visible(){
          public String getName(){
              return "светящийся диск";
          }
        };
        System.out.print(this.getName() + " увидели " + color.getColor() + " " + disk.getName());
    }
    public void checkSuits(){
        for(Astronaut a : this.getArray()) {
            if (!(a.isSuitOn())) {
                System.out.print("не все космонавты надели скафандры");
                System.out.print(a.getName());
                break;
            }
        }
        System.out.print("скафандры были надеты");

    }
}
