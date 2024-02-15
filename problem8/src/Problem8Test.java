import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem8Test {

    @Test
    public void testConvertSecondsWithSmallValue() {
        assertEquals("0 Days(s) 0 Hours(s) 1 Minutes(s) 30 Seconds(s)", Problem8.convertFromSeconds(90));
    }

    @Test
    public void testConvertSecondsWithHoursAndMinutes() {
        assertEquals("1 Days(s) 2 Hours(s) 30 Minutes(s) 0 Seconds(s)", Problem8.convertFromSeconds(95400));
    }

    @Test
    public void testConvertSecondsWithLargeValue() {
        assertEquals("286 Days(s) 21 Hours(s) 59 Minutes(s) 24 Seconds(s)", Problem8.convertFromSeconds(24789564));
    }

    @Test
    public void testConvertSecondsWithZeroSeconds() {
        assertEquals("2 Days(s) 4 Hours(s) 30 Minutes(s) 0 Seconds(s)", Problem8.convertFromSeconds(189000));
    }
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertFromSeconds() {
    }

    @Test
    public void main() {
    }
    
}
