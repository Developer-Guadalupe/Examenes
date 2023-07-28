public class EmpleadoAsalariado extends TipoEmpleado{

    //Creamos variables de referencias
    int horasTrabajadas;
    float pagoPorHoraExtra;

    //Creamos el constructor , referente a la clase padre , usando "super" y variables de referencias
    public EmpleadoAsalariado(String nombre, float salarioBase, int horasTrabajadas, float pagoPorHoraExtra) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    // Sobreescribimos el metodo para calcular el salario por las horas trabajadas y el pago por hora extra realizada
    @Override
    public float calcularSalario() {
        return salarioBase + (horasTrabajadas * pagoPorHoraExtra);
    }




}
