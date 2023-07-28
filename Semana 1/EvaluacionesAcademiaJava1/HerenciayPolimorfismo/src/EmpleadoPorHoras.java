public class EmpleadoPorHoras extends TipoEmpleado{

    //Creamos nuestras variables de referencias
         int horasTrabajadas;
         float pagoPorHoraExtra;

    //Creamos el constructor , referente a la clase padre , usando "super" y variables de referencias
        public EmpleadoPorHoras (String nombre, float salarioBase, int horasTrabajadas, float pagoPorHoraExtra) {
            super(nombre, salarioBase);
            this.horasTrabajadas = horasTrabajadas;
            this.pagoPorHoraExtra = pagoPorHoraExtra;
        }

        // Sobrescribimos el metodo para calcular las horas trabajadas y su ganancia
        @Override
        public float calcularSalario() {
            return  (horasTrabajadas * pagoPorHoraExtra);
        }
    }

