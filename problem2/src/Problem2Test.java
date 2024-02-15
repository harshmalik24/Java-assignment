import static org.junit.Assert.*;
import org.junit.Test;
public class Problem2Test {

    @Test
    public void testGrossPriceWithPositiveValues() {
        assertEquals(83.33, Problem2.grossPrice(100.0, 0.2), 0.01);
    }

    @Test
    public void testGrossPriceWithZeroNetPrice() {
        assertEquals(0.0, Problem2.grossPrice(0.0, 0.1), 0.01);
    }

    @Test
    public void testGrossPriceWithZeroTaxRate() {
        assertEquals(50.0, Problem2.grossPrice(50.0, 0.0), 0.01);
    }

    @Test
    public void testGrossPriceWithNegativeNetPrice() {
        assertEquals(-83.33, Problem2.grossPrice(-100.0, 0.2), 0.01);
    }

    @Test
    public void testGrossPriceWithNegativeTaxRate() {
        assertEquals(55.56, Problem2.grossPrice(50.0, -0.1), 0.01);
    }

    @Test
    public void testGrossPriceWithLargeValues() {
        assertEquals(320000.0, Problem2.grossPrice(400000.0, 0.25), 0.01);
    }

    @org.junit.Test
    public void grossPrice() {
    }

    @org.junit.Test
    public void main() {
    }
}