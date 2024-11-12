package amstrong.ejercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
        @Test
        void testAppWithSpecialNumber() {
        String simulatedInput = "371\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        App.main(new String[]{});
        String output = outputStream.toString().trim();
        assertTrue(output.contains("371 Numero especial."));
    }

}
