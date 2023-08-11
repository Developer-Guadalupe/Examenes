public class Alumnos {

    //Creamos variables de referencias
    private String nombre;
    private int edad;
    private String  universidad;

    //Creamos constructor para recibir por parametro 2 string, y un Entero
    public Alumnos(String nombre, int edad, String universidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
    }

    //Creamos metodo getter para obtener el nombre, y retornamos nombre
    public String getNombre() {
        return nombre;
    }

    //Creamos metodo getter para obtener la edad, y retornamos edad
    public int getEdad() {
        return edad;
    }

    //Creamos metodo getter para obtener universidad, y retornamos universidad
    public String getUniversidad() {
        return universidad;
    }

}
