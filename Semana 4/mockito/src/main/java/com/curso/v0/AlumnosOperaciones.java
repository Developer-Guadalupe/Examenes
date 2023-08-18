package com.curso.v0;

public class AlumnosOperaciones {
	
    private Operacion mathOperacion;

    public AlumnosOperaciones(Operacion mathOperacion) {
        this.mathOperacion = mathOperacion;
    }

    public void asignarResultado(Alumno alumno, double a, double b, double c) {
        double resultado = mathOperacion.sumAndDivide(a, b, c);
        alumno.setResultado(resultado);
    }
}