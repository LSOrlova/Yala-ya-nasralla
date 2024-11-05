package il.example;

public class CounterNassrallahs {
    public static int calculateNasrallas(NasrallaConfig config) {
        int currentNasrallaLifeDuration = config.getNasrallaLifeDuration();
        int nasrallaCounter = 0;
        int nasrallaTotalCounter = 0;

        while (currentNasrallaLifeDuration >= config.getNasrallaLastLifeDuration()) {
            nasrallaCounter++;
            if (nasrallaCounter == 3 || nasrallaCounter == 6) {
                System.out.println("This nasralla number " + nasrallaCounter + " refused.");
            } else {
                nasrallaTotalCounter++;
            }
            currentNasrallaLifeDuration -= 2;
        }

        return nasrallaTotalCounter;
    }
}
