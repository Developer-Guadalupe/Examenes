import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
class DuplicarNumeroTest {

    @Test
    void Test(){

        // Creamos la lista con numeros enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Ejecutamos un stream para duplicar la lista de numeros
        List<Integer> numerosDuplicados = numeros.stream()
                // Realiza la operacion de duplicar
                .map(numero -> numero * 2)
                // Recolectamos los resultados de la nueva lista
                .collect(Collectors.toList());

        // Creamos la lista con los numeros duplicados manualmente
        List<Integer> expectedNumerosDuplicados = new ArrayList<>();
        expectedNumerosDuplicados.add(20);
        expectedNumerosDuplicados.add(40);
        expectedNumerosDuplicados.add(60);
        expectedNumerosDuplicados.add(80);
        expectedNumerosDuplicados.add(100);

        // Con assertEquals vamos a verificar si la lista  de la duplicacion es igual a la lista esperada
        assertEquals(expectedNumerosDuplicados, numerosDuplicados);

    }

}