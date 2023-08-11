import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTareasPorDia {

    // Vamos ir guardando los resultados en cada prueba
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    //Guardamos la salida original, para restaurar despues de cada prueba
    private final PrintStream originalSystemOut = System.out;

     // Antes de cada prueba, redirigimos la salida a una salida personalizada
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    //Despues de cada prueba, regresamos a la salida original
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalSystemOut);
    }

    //Aqui vamos a verificar si las tareas de cada dia de la semana se muestran correctamente
    // al ejecutar el metodo main de la clase AsignacionTarea.
    @Test
    public void testTareasPorDia() {

        // Ejecutamos el metodo main de AsignacionTarea
        AsignacionTarea.main(new String[]{});

        // Definimos la salida esperada que deberia mostrar las tareas por dia
        String[] expectedOutput = {
                "Tareas para realizar hoy Lunes:",
                "- Capacitacion Java",
                "- Practicar, realizar proyectos",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Martes:",
                "- Capacitacion Java",
                "- Repasar temas",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Miercoles:",
                "- Capacitacion Java",
                "- Check-Point",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Jueves:",
                "- Capacitacion Java",
                "- Terminar proyectos",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Viernes:",
                "- Capacitacion Java",
                "- Revision de proyectos",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Sabado:",
                "- Ir de compras",
                "- Ir a la ecuela de Ingles",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                "Tareas para realizar hoy Domingo:",
                "- Disfrutar el dia",
                "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        };

        // Dividimos la salida por lineas individuales
        String actualOutput = outputStream.toString();
        String[] actualOutputLines = actualOutput.split(System.lineSeparator());

        // Verificamos si la salida, coincide con la salida esperada
        assertEquals(expectedOutput.length, actualOutputLines.length);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutputLines[i].trim());
        }
    }
}
