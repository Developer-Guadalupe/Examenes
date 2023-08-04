//Clase Cliente, hereda de la interfaz de Observer
class Cliente implements Observer {

    //Creamos una variable de referencia de tipo String
    private String nombre;

    //Creamos el constructor Cliente, que recibe por parametro un String
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    //Sobreescribimos el metodo actualizar, con su comportamiento
    @Override
    public void actualizar(String productoNombre, double precio) {
        System.out.println(nombre + ", realizaste compra de: " + productoNombre + " por $" + precio);
    }
}
