import static org.junit.Assert.*;
import org.junit.Test;

public class Problem10Test {


    @Test
    public void testSecondLargestWithPositiveNumbers() {
        int[] arr = {5, 10, 4, 8, 1};
        assertEquals(8, Problem10.secondLargest(arr));
    }

    @Test
    public void testSecondLargestWithNegativeNumbers() {
        int[] arr = {-2, -5, -1, -8, -3};
        assertEquals(-2, Problem10.secondLargest(arr));
    }

    @Test
    public void testSecondLargestWithDuplicateNumbers() {
        int[] arr = {4, 7, 4, 1, 9};
        assertEquals(7, Problem10.secondLargest(arr));
    }

    @Test
    public void testSecondLargestWithZero() {
        int[] arr = {0, 0, 0, 0, 0};
        assertEquals(0, Problem10.secondLargest(arr));
    }


    @Test
    public void secondLargest() {
    }

    @Test
    public void main() {
    }
}