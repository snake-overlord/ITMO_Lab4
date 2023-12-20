package enums;

public enum HowToAct {
    FASTER(" всё быстрей и быстрей"),
    ATALL(" совсем"),
    YET(" ещё"),
    AGAIN(" снова"),
    ALREADY(" уже"),
    FAST("быстро");

    private final String name;
    HowToAct(String name){
        this.name = name;
    }
    public String getAdv(){
        return name;
    }
}
