package objects.things;

import java.util.ArrayList;
import java.util.List;

public class SpacesuitBox {
    private List<Spacesuit> spacesuits;
    public SpacesuitBox(Spacesuit ... suits){
        this.spacesuits = new ArrayList<>(List.of(suits));
    }
    public void addSpacesuit(Spacesuit s){
        this.spacesuits.add(s);
    }

    public List<Spacesuit> getArray(){
        return this.spacesuits;
    }
    public void removeSuit(int index){
        this.spacesuits.remove(index);
    }
}
