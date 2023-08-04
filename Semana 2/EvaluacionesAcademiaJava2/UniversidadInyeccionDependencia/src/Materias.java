public class Materias {

    // Creamos un arreglo de tipo String
    private String[] nombreMateria;

    // Creamos el constructor de Materias que recibe por parametro un arreglo de tipo string.
    public Materias(String[] nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    // Creamos un metodo get para poder acceder y obtener el valor del arreglo
    public String[] getNombreMateria() {
        return nombreMateria;
    }

    // Creamos un metodo set para poder asignar el nuevo valor al arreglo, recibido como parametro
    public void setNombreMateria(String[] nombre) {
        this.nombreMateria = nombreMateria;
    }

}
