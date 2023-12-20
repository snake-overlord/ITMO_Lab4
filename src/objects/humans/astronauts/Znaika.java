package objects.humans.astronauts;

import exceptions.SpacesuitsAreOutException;
import commands.mineCrystalsCommand;
import commands.spacesuitOnCommand;
import commands.stayHereCommand;
import commands.tieToCordCommand;

public class Znaika extends Astronaut{
    private String name;

    public Znaika(String name){
        super(name);
        this.name = name;
    }
    public void giveCommandSuitsOn(spacesuitOnCommand command) throws SpacesuitsAreOutException {
        System.out.print(this.name + " отдал команду надеть всем скафандры. ");
        command.execute();
    }
    public void giveCommandTieToCord(tieToCordCommand command){
        System.out.print(this.name + " приказал всем привязаться к длинному капроновому шнуру. ");
        command.execute();
    }
    public void giveCommandStayHere(stayHereCommand command){
        System.out.print(this.name + " отдал распоряжение всем оставаться на месте");
        command.execute();
    }
    public void giveCommandMine(mineCrystalsCommand command){
        System.out.print(this.name + " велел остальным заняться добычей кристаллов лунита и антилунита.\n");
        command.execute();
    }
    public void checkPreparations(Astronauts astr){
        for(Astronaut a : astr.getArray()) {
            if (!(a.isSuitOn() && a.isTiedToCord())) {
                System.out.print("Приготовления ещё не были завершены!");
                break;
            }
        }
        System.out.print("Наконец, все приготовления были закончены");

    }
    public Astronauts makeNewGroup(String name, Astronaut ... astr){
        Astronauts group = new Astronauts(name, astr);
        System.out.print("В " + name + " он решил назначить " + group.crewNames());
        return group;
    }
    public void goBackWith(Astronauts astr){
        System.out.print(this.getName() + "взяв с собой" + astr.crewNames() + "отправился в обратный путь");
    }
    public void decidedToDivide(){
        System.out.print(this.getName() + " решил поделить весь отряд на две группы");
    }
    public void riseUp(){
        if(this.getSuit().engine.isOn())
            System.out.print(this.getName() + ", потеряв вес, плавно поднялся в воздух");
        else
            System.out.print(this.getName() + " остался на земле");
    }
    public void takeOthersWith(){
        System.out.print(this.getName() + " потащил за собой остальных космонавтов");
    }
}