package il.example;

public class Main {
    public static void main(String[] args) {

        NasrallaConfig config = new NasrallaConfig(48, 36, 10);
        int nasrallaTotalCounter = CounterNassrallahs.calculateNasrallas(config);
        int totalSpentTime = config.getSetUpTime() * nasrallaTotalCounter / 24;

        System.out.println("Iran will have time to appoint " + nasrallaTotalCounter + " nasrallas for " + totalSpentTime + " days");
    }
}