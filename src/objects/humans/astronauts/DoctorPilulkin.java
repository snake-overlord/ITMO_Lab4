package objects.humans.astronauts;

import objects.humans.Human;

public class DoctorPilulkin extends Astronaut{
    private String name;
    public DoctorPilulkin(String name){
        super(name);
        this.name = name;
    }
    public void giveSbAmmonia(Human h){
        System.out.print(" увидев, что у " + h.getName() + " глаза сами собой закрылись, поскорей дал ему понюхать нашатырного спирта");
    }
    public void saySbFeelsBad(Human h){
        System.out.print(this.getName() + " сказал, что " + h.getName()  + " чувствует себя очень плохо, поэтому его нужно немедля отправить в ракету, где он может освободиться от тяжелого скафандра");
    }



}
