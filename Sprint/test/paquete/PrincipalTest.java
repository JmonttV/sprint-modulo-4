package paquete;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PrincipalTest {

    @Test
    void testMostrarMenu() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Lamer al método que muestra el menú
        Principal.mostrarMenu();

        String expectedOutput = "\n Menú Principal:\n" +
                "1. Almacenar Usuario\n" +
                "2. Almacenar Capacitación\n" +
                "3. Listar Usuario\n" +
                "4. Listar Capacitación\n" +
                "5. Almacenar Accidente\n" +
                "6. Visitas a Terreno\n" +
                "7. Almacenar Revisión\n" +
                "8. Eliminar Usuario\n" +
                "9. Salir\n\n" +
                " Seleccione una opción: ";

        assertEquals(expectedOutput, outContent.toString());
    }

  
}
