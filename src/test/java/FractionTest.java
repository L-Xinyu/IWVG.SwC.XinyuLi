import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(1, 3);
    }

    @Test
    void testFraction() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.3333333333333, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testIsPropia() {
        assertTrue(this.fraction.isPropia());
        assertFalse(new Fraction(2, 2).isPropia());
    }

    @Test
    void testCompare() {
        assertTrue(this.fraction.compare(new Fraction(2, 6)));
        assertFalse(this.fraction.compare(new Fraction(4, 6)));
    }

}
