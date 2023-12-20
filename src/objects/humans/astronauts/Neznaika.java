package objects.humans.astronauts;

public class Neznaika extends Astronaut{
    private String name;
    public Neznaika(String name){
        super(name);
        this.name = name;
    }
    public void rememberSun(){
        System.out.print(this.getName() + " вспомнил про солнышко");
    }
    public void cry(){
        System.out.print("слёзы закапали из его глаз");
    }
    public void loseConsciousness(){
        System.out.print("Силы покинули его, и он опустился прямо на землю");
    }
    public void comeToSenses(){
        System.out.print(this.getName() + " пришёл в себя");
    }
    public void bePale(){
        System.out.print("был очень бледен");
    }

}
