package enums;

public enum Color {
    LightBlue("ярко-белого, слегка голубоватого цвета"),
    Red("красного"),
    Green("зелёного"),
    Emerald("изумрудно-зелёным"),
    Blue("ярко-голубым"),
    Black("чёрное");


    private final String name;
    Color(String name){
        this.name = name;
    }
    public String getColor(){
        return name;
    }
}
