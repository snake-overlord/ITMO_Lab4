package enums;

public enum SimpleAction {
    Run("подбежал"),
    BeOutOfSight("скрылись из виду"),
    Yell("закричали"),
    Applause("захлопали в ладоши"),
    ThrowHats("стали подбрасывать в воздух шапки"),
    WaveHands("замахали руками"),
    Hope("надеялись"),
    Return("вернутся"),
    Cry("плакали"),
    GoingToFly("собираются улетать"),
    Come("пришли");
    private String name;
    SimpleAction(String name) {
        this.name = name;
    }
    public String getAct() {
        return name;
    }
}
