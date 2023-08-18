package com.curso.v0;

public class AlumnoPromedio {
	
    public static void main(String[] args) {
    	
    	Operacion operacion = new Operacion();
        
        AlumnosOperaciones alumnosOperaciones = new AlumnosOperaciones(operacion);

        Alumno alumno = new Alumno();
        alumno.setNombre("Choi Si-won");

        alumnosOperaciones.asignarResultado(alumno, 10, 8, 9);

        System.out.println("El resultado asignado al alumno es: " + alumno.getResultado());
    }
}
