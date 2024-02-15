import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problem7Test {

    @Test
    public void testRetailInflationWithPositiveValues() {
        assertEquals(2.49, Problem7.retailInflation(20, 5), 0.01);
    }

    @Test
    public void testRetailInflationWithZeroInflation() {
        assertEquals(1.0, Problem7.retailInflation(0, 5), 0.01);
    }

    @Test
    public void testRetailInflationWithZeroYears() {
        assertEquals(1.0, Problem7.retailInflation(3, 0), 0.01);
    }

    @Test
    public void testPercentInflationWithPositiveValues() {
        assertEquals(16.0, Problem7.percentInflation(5, 3), 0.01);
    }

    @Test
    public void testPercentInflationWithZeroInflation() {
        assertEquals(0.0, Problem7.percentInflation(0, 5), 0.01);
    }

}
