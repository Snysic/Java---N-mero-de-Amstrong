package amstrong.ejercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NúmeroTest {
    @Test
    void testPositiveCases() {
        assertTrue(Número.isSpecialNumber(371), "371 true");
        assertTrue(Número.isSpecialNumber(1634), "1634 true");
    }

    @Test
    void testNegativeCases() {
        assertFalse(Número.isSpecialNumber(351), "351 false");
        assertFalse(Número.isSpecialNumber(2015), "2015 false");
    } 
}