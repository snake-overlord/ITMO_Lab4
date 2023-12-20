package objects.humans;

import enums.Emotion;
import enums.HowToAct;
import enums.SimpleAction;
import enums.Time;
import interfaces.Visible;
import objects.Obj;

public class Lunarians extends Human {
    private String name;

    public Lunarians(String name){
        super(name);
        this.name = name;
    }
    public void cry(Emotion e) {
        if(e==Emotion.HAPPINESS)
            System.out.print(this.getName() + " плакали от радости");
        else if(e==Emotion.SADNESS)
            System.out.print(this.getName() + " плакали от горя");
        else
            System.out.print(this.getName() + " плакали");
    }
    public void spreadNews(Human h, SimpleAction act, HowToAct t){
        System.out.print("Весть о том, что ");
        h.simpleAct(act);
        System.out.print(", " + t.getAdv() + " разнеслась среди " + this.getName());
    }
    public void gatherToSayGoodbye(Human h){
        System.out.print(this.getName() + " всей деревней пришли, чтобы попрощаться со " + h.getName());
    }
    public void kissGoodbye(Human h){
        System.out.print(this.getName() + " целовали " +h.getName() + " и остальных коротышек");
    }


    public void seeSb(Visible v, HowToAct adv){
        System.out.print("они" +adv.getAdv() + " увидят " + v.getName());
    }
    public void lostHopeToSeeSb(Visible v, Time time, HowToAct adv){
        System.out.print(time.getTime() + this.getName() + " начали терять надежду" + adv.getAdv() + " увидеть " + v.getName());
    }
    public void haveSthToWait(Obj o){
        if(this.hashCode() == o.hashCode())
            System.out.print(this.getName() + " ждали не зря");
        else
            System.out.print("ждать больше было нечего");
    }
    public void gasp(Emotion e){
        System.out.print(this.getName() + " ахнули");
        switch(e){
            case AMAZEMENT -> System.out.print(" от изумления");
            case EXCITEMENT -> System.out.print(" от восторга");
            case HORROR -> System.out.print(" от ужаса");
            default -> System.out.print("");
        }
    }
    public void jump(Emotion e) {
        System.out.print(this.getName() + " прыгали");
        switch (e) {
            case AMAZEMENT -> System.out.print(" от изумления");
            case EXCITEMENT -> System.out.print(" от восторга");
            case HORROR -> System.out.print(" от ужаса");
            default -> System.out.print("");
        }
    }




}
