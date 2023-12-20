package objects.humans.astronauts;

import exceptions.SpacesuitsAreOutException;
import interfaces.Sittable;
import objects.things.SpacesuitBox;

public class KantikAndKvantik extends Astronaut {
    private String name;
    public KantikAndKvantik(String name){
        super(name);
        this.name = name;
    }
    public void putSuitOnSb(Astronaut a, SpacesuitBox box) throws SpacesuitsAreOutException {
        a.putSpacesuitOn(box);
        System.out.print(this.getName() + " надели скафандр на " + a.getName());
    }
    public void tieSbToCord(Astronaut h, Sittable s){
        System.out.print(this.getName() + " усадили " + h.getName() + " в " + s.getName() + ", прикрепили его ремнями к сиденью, а " + s.getName() + " тоже привязали к капроновому шнуру");
        h.tieToCord();
    }


}
