package objects.humans;

import enums.Emotion;

public class Kozlik extends Human {
    private String name;

    public Kozlik(String name) {
        super(name);
        this.name = name;
    }

    public void beEmotional(Emotion e) {
        switch (e) {
            case SADNESS -> System.out.print(this.getName() + " был грустным");
            case HAPPINESS -> System.out.print(this.getName() + " был очень рад");
            case EXCITEMENT -> System.out.print(this.getName() + " был в восторге");
            default -> System.out.print(this.getName() + "был спокоен");
        }
    }

}