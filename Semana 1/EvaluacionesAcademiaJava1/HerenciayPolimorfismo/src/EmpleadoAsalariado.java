public class EmpleadoAsalariado extends TipoEmpleado{

    //No creamos variables de referencias, todas las  variables de referencia, las hereda de clase padre

    //Creamos el constructor , referente a la clase padre , usando "super"
    public EmpleadoAsalariado(String nombre, float salarioBase) {
        super(nombre, salarioBase);
    }

    // No es necesario sobreescribir el metodo calcularSalario(), es el mismo que la clase padre

}
