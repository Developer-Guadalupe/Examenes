package com.curso.v0;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

class TestAlumno {

    @Test
    void testAsignarResultado() {
    	
        // Crear un mock de Operacion
    	Operacion mockOperacion = mock(Operacion.class);

        // Definir el comportamiento del mock
        when(mockOperacion.sumAndDivide(10, 8, 9)).thenReturn(9.0);

        // Crear una instancia de AlumnosOperaciones que utiliza el mock
        AlumnosOperaciones alumnosOperaciones = new AlumnosOperaciones(mockOperacion);

        // Crear un alumno
        Alumno alumno = new Alumno();
        alumno.setNombre("Choi Si-won");

        // Realizar la prueba
        alumnosOperaciones.asignarResultado(alumno, 10, 8, 9);

        // Verificar que se llamo al metodo
        verify(mockOperacion).sumAndDivide(10, 8, 9);

        // Verificar el resultado de la prueba
        assertEquals(9.0, alumno.getResultado());
    }
}
