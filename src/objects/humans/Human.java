package objects.humans;

import enums.HowToAct;
import enums.SimpleAction;
import enums.Time;
import interfaces.Imagine;
import objects.*;

public abstract class Human extends Obj {
    private String name;
    public Human(String name){
        super(name);
        this.name = name;
    }
    public void simpleAct(SimpleAction act, Time time, HowToAct adv){
        System.out.print(this.getName() + time.getTime() + adv.getAdv() + " " + act.getAct());
    }
    public void simpleAct(SimpleAction act){
        System.out.print(this.getName() + " " + act.getAct());
    }
    public void simpleAct(SimpleAction act, Time time){
        System.out.print(this.getName() + time.getTime() + " " + act.getAct());
    }
    public void simpleAct(SimpleAction act, HowToAct adv){
        System.out.print(this.getName() + adv.getAdv() + " " + act.getAct());
    }

    public static void someoneImagines(){
        Imagine someone = new Imagine(){
            @Override
            public void imagineSth(){
                System.out.print("Кто-то воображает");
            }
        };
        someone.imagineSth();
    }

}

