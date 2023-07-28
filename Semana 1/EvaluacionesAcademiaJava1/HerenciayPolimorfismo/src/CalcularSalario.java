public class CalcularSalario {
    public static void main(String[] args) {

        //Creamos instancias de los diferentes tipos de empleados
        TipoEmpleado e1 = new EmpleadoAsalariado("Amanda Miguel" , 3500);
        TipoEmpleado e2 = new EmpleadoPorHoras("Eugenio Derbez", 2000, 160, 200);
        TipoEmpleado e3 = new EmpleadoPorComision("Enrique Iglesias", 1500F, 50000,  150.67f);

        // Calcular y mostrar el salario de cada empleado
        System.out.println("Salario empleada " + e1.nombre + ": $" + e1.calcularSalario());
        System.out.println("Salario empleado " + e2.nombre + ": $" + e2.calcularSalario());
        System.out.println("Salario empleado " + e3.nombre + ": $" + e3.calcularSalario());
    }

}
