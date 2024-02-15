import static org.junit.Assert.*;

public class Problem5Test {
    @org.junit.Test
    public void testIncomeTaxWithNoTax() {
        assertEquals(0, Problem5.incomeTax(190000));
    }

    @org.junit.Test
    public void testIncomeTaxWith10PercentTax() {
        assertEquals(9500, Problem5.incomeTax(345000));
    }

    @org.junit.Test
    public void testIncomeTaxWith20PercentTax() {
        assertEquals(81000, Problem5.incomeTax(780000));
    }

    @org.junit.Test
    public void testIncomeTaxWith30PercentTax() {
        assertEquals(545000, Problem5.incomeTax(2400000));
    }

    @org.junit.Test
    public void testIncomeTaxWithNegativeIncome() {
        assertEquals(0, Problem5.incomeTax(-50000));
    }

    @org.junit.Test
    public void testIncomeTaxWithZeroIncome() {
        assertEquals(0, Problem5.incomeTax(0));
    }
}

