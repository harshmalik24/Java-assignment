import static org.junit.Assert.*;
import org.junit.Test;

public class Problem9Test {

    @Test
    public void testSpecialDigitWithSpecialInteger() {
        assertTrue(Problem9.specialDigit(59));
    }

    @Test
    public void testSpecialDigitWithNonSpecialInteger() {
        assertFalse(Problem9.specialDigit(24));
    }

    @Test
    public void testSpecialDigitWithSingleDigitNumber() {
        assertFalse(Problem9.specialDigit(7));
    }

    @Test
    public void testSpecialDigitWithThreeDigitNumber() {
        assertFalse(Problem9.specialDigit(123));
    }

    @Test
    public void testSpecialDigitWithZero() {
        assertFalse(Problem9.specialDigit(0));
    }

    @Test
    public void testSpecialDigitWithNegativeNumber() {
        assertFalse(Problem9.specialDigit(-69));
    }

    @Test
    public void specialDigit() {
    }

    @Test
    public void main() {
    }
}