import static org.junit.Assert.*;
import org.junit.Test;

public class Problem4Test {


    @Test
    public void testMedianOfWithOddSize() {
        double[] arr = {4.0, 2.0, 7.0, 1.0, 5.0};
        assertEquals(4.0, Problem4.medianOf(arr, arr.length), 0.01);
    }

    @Test
    public void testMedianOfWithEvenSize() {
        double[] arr = {3.0, 1.0, 5.0, 2.0};
        assertEquals(2.5, Problem4.medianOf(arr, arr.length), 0.01);
    }

    @Test
    public void testMedianOfWithEmptyArray() {
        double[] arr = {};
        assertEquals(-1.0, Problem4.medianOf(arr, arr.length), 0.01);
    }

    @Test
    public void testMedianOfWithSingleElementArray() {
        double[] arr = {8.0};
        assertEquals(8.0, Problem4.medianOf(arr, arr.length), 0.01);
    }

    @Test
    public void testMedianOfWithDuplicateValues() {
        double[] arr = {5.0, 5.0, 5.0, 5.0, 5.0};
        assertEquals(5.0, Problem4.medianOf(arr, arr.length), 0.01);
    }

    @Test
    public void testMedianOfWithNegativeValues() {
        double[] arr = {-3.0, -7.0, -1.0, -5.0};
        assertEquals(-4.0, Problem4.medianOf(arr, arr.length), 0.01);
    }


    @Test
    public void medianOf() {
    }

    @Test
    public void main() {
    }
}