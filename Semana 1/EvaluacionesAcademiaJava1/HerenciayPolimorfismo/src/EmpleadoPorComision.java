public class EmpleadoPorComision extends TipoEmpleado{

    //Creamos nuestras variables de referencias
    int ventas;
    float comision;

    //Creamos el constructor , referente a la clase padre , usando "super" y variables de referencias
    public EmpleadoPorComision(String nombre, float salarioBase, int ventas, float comision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }

    // Sobrescribimos el metodo, para calcular el salario de las ventas y la comision
    @Override
    public float calcularSalario() {
        return salarioBase +  (ventas * comision);
    }

}
