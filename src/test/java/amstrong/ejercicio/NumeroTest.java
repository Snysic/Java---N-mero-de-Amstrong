package amstrong.ejercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumeroTest {
    @Test
    void testPositiveCases() {
        assertTrue(Numero.isSpecialNumber(371), "371 true");
        assertTrue(Numero.isSpecialNumber(1634), "1634 true");
    }

    @Test
    void testNegativeCases() {
        assertFalse(Numero.isSpecialNumber(351), "351 false");
        assertFalse(Numero.isSpecialNumber(2015), "2015 false");
    } 
}