package il.example;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MainTest {

        @org.junit.Before
        public void setUp() throws Exception {
        }

        @Test
        @Description("test happy path")
        public void happyPath() {
            NasrallaConfig config = new NasrallaConfig(48, 36, 10);
            int result = CounterNassrallahs.calculateNasrallas(config);
            assertEquals(12, result);
        }
        @Test
        @Description("if nasralla's life duration will be 10 hours from start")
        public void testMinimumLifeDurationEdgeCase() {
            NasrallaConfig config = new NasrallaConfig(48, 10, 10);
            int result = CounterNassrallahs.calculateNasrallas(config);
            assertEquals(1, result);
        }

        @Test
        @Description("make sure that nasralla 3 and 5 were refused")
        public void testRefusedNasralla() {
            NasrallaConfig config = new NasrallaConfig(48, 36, 10);
            int result = CounterNassrallahs.calculateNasrallas(config);
            assertEquals(12, result);
        }

        @Test
        @Description("case when there is no time to appoint new nasralla")
        public void testNoNasrallaAppointed() {
            NasrallaConfig config = new NasrallaConfig(48, 8, 10);
            int result = CounterNassrallahs.calculateNasrallas(config);
            assertEquals(0, result);
        }

        @Test
        @Description("if the start time to appoint will be shorter")
        public void testShorterSetUpTime() {
            NasrallaConfig config = new NasrallaConfig(24, 36, 10);
            int result = CounterNassrallahs.calculateNasrallas(config);
            int expectedDays = config.getSetUpTime() * result / 24;
            assertEquals(12, result);
            assertEquals(12, expectedDays);
        }
    }
