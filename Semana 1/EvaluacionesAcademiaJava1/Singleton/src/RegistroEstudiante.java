public class RegistroEstudiante {

    //Creamos la unica instancia para el resgistro del alumno  de la Universidad
    private static RegistroEstudiante estudiante = new RegistroEstudiante("Formulario de Estudiantes");

    //Creamos variables de referencias
    String nombre;
    static int contador;

    //Creamos constructor privado, para evitar crear instancias directas
    private RegistroEstudiante(String nombre) {
        //Inicializamos variable de referencia para asignar valor recibido como parámetro
        this.nombre = nombre;
        contador++;
    }

    public static int getObtenerRegistros() {
        return contador;
    }

    public static RegistroEstudiante getInstance() {return estudiante;}

}
