public class Alumno {

    //Creamos variables de referencias
    private String nombre;
    private Carrera carrera; // Creamos la inyeccin de dependencia, el alumno esta asociado a una carrera

    // Creamos el constructor de alumnos que recibe como parametro un string y una variable de tipo Carreras
    public Alumno(String nombre, Carrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    // Creamos metodo get para obtener el nombre del alumno
    public String getNombreAlumno() {
        return nombre;
    }

    // Creamos el metodo set para asignar nombre alumno
    public void setNombreAlumno(String nombre) {
        this.nombre = nombre;
    }

    //  Creamos metodo para obtener la carrera (se aplica la inyeccion de dependencia)
    public Carrera getCarrera() {
        return carrera;
    }

    // Creamos el metodo set para asignar carrera (se aplica la inyeccion de dependencia)
    public void setNombreCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
