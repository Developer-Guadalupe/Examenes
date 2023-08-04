public class Carrera {

    //  Creamos un arreglo de tipo String
    private String[] nombreCarrera;
    private Materias materias; // Creamos la inyeccion de dependencia, una carrera esta asociado a lista de materias

    // Creamos el constructor de Carreras que recibe como parametro un arreglo de tipo String
    public Carrera(String[] nombreCarrera, Materias materias) {
        this.nombreCarrera = nombreCarrera;
        this.materias = materias;
    }

    public String[] getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String[] nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    // Creamos el metodo get para agregar las materias (se aplica la inyeccion de dependencia)
    public Materias getMaterias() {
        return materias;
    }

    // Creamos el metodo set para agregar las materias (se aplica la inyeccion de dependencia)
    public void setMaterias(Materias materias) {
        this.materias = materias;
    }
}
