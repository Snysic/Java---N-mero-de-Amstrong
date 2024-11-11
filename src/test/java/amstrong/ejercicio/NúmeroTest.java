package amstrong.ejercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NúmeroTest {
    @Test
    void testPositiveCases() {
        assertTrue(Número.isSpecialNumber(371), "371 true");
        assertTrue(Número.isSpecialNumber(1634), "1634 true");
    }

    

}