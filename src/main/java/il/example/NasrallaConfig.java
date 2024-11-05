package il.example;

public class NasrallaConfig {
    private int setUpTime;
    private int nasrallaLifeDuration;
    private int nasrallaLastLifeDuration;

    public NasrallaConfig(int setUpTime, int nasrallaLifeDuration, int nasrallaLastLifeDuration) {
        this.setUpTime = setUpTime;
        this.nasrallaLifeDuration = nasrallaLifeDuration;
        this.nasrallaLastLifeDuration = nasrallaLastLifeDuration;
    }

    // getters for fields
    public int getSetUpTime() {
        return setUpTime;
    }

    public int getNasrallaLifeDuration() {
        return nasrallaLifeDuration;
    }

    public int getNasrallaLastLifeDuration() {
        return nasrallaLastLifeDuration;
    }
}

