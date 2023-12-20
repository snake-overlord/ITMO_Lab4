package objects.things;

import objects.Obj;

public class Spacesuit extends Obj {
    private String name;
    public Engine engine;
    public Propeller prop;
    public Spacesuit(){
        super("скафандр");
        this.name = "скафандр";
        this.engine = new Engine("электродвигатель");
        this.prop = new Propeller("пропеллер");
    }
    public class Engine{
        private String name;
        private boolean isOn = false;
        private Engine(String name){
            this.name = name;
        }
        public void start(){
            this.isOn = true;
        }
        public void stop(){
            this.isOn = false;
        }

        public boolean isOn() {
            return isOn;
        }
    }
    public class Propeller{
        private String name;
        private Propeller(String name){
            this.name = name;
        }
        public void makeNoise(){
            if(engine.isOn)
                System.out.print(this.name + " завертелся и начал жужжать");
            else
                System.out.print(this.name + " не работал и не шумел");
        }
        public void canLift(){
            System.out.print(this.name + ", вращаясь, может поднять космонавта в воздух");
        }
        public void createThrust(ThrustQuality t){
            if(!engine.isOn)
                System.out.print(this.name + " не создавал тягу");
            else if(t==ThrustQuality.STRONG)
                System.out.print(this.name + " создавал достаточно сильную тягу");
            else
                System.out.print(this.name + " создавал слишком слабую тягу");
        }
    }

    public void getProperties(){
        System.out.print("На макушке гермошлема такого скафандра был установлен небольшой электродвигатель с четырехлопастным пропеллером вроде вентилятора");
    }

}
