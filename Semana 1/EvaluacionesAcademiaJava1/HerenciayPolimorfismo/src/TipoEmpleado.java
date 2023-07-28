public class TipoEmpleado {

//Creamos las variables de referencia
     String nombre;
     float salarioBase;

    // Constructor para asignar valor recibido por parametros
    public TipoEmpleado(String nombre, float salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Metodo para calcular el salario dependiendo del tipo de emplado, y retorna el salario base
    public float calcularSalario() {
        return salarioBase;
    }

}
