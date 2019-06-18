package Examples;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {
    private Money f12CHF;
    private Money f14CHF;
    private Money f20USD;

    protected void setUp() {
        try {
            f12CHF = new Money(12, "CHF");
            f14CHF = new Money(14, "CHF");
            // f20USD = new Money(20, "USD");
        } catch (IllegalArgumentException e) {
            System.err.println("Sorry, USD account currently unavailable");
        }
    }

    protected void tearDown() {
        f12CHF = null;
        f14CHF = null;
        f20USD = null;
    }

    public void testSimpleAdd() {
        Money expected = new Money(26, "CHF");
        Money result = f12CHF.add(f14CHF);
        assertTrue(expected.equals(result));
    }

    public void runTest() {
        testSimpleAdd();
    }
}