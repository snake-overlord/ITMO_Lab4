package enums;

public enum Time {
    SIMPLE(""),
    ATTHATTIME(" в это время"),
    MEANWHILE(" между тем");

    private final String name;
    Time(String name){
        this.name = name;
    }
    public String getTime(){
        return name;
    }
}
