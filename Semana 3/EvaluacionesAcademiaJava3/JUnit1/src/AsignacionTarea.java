import java.util.ArrayList;
import java.util.List;
public class AsignacionTarea {
        public static void main(String[] args) {

            // Creamos un arreglo con los dias de la semana
            String[] diasSemanas = {
                    "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            };

            // Creamos el arreglo de lista de tareas, uno para cada dia de la semana
            List<String>[] tareasPorDia = new ArrayList[7];

            // Inicializamos el arreglo, asignando las tareas por cada dia
            tareasPorDia[0] = new ArrayList<>();
            tareasPorDia[0].add("Capacitacion Java");
            tareasPorDia[0].add("Practicar, realizar proyectos");

            tareasPorDia[1] = new ArrayList<>();
            tareasPorDia[1].add("Capacitacion Java");
            tareasPorDia[1].add("Repasar temas");

            tareasPorDia[2] = new ArrayList<>();
            tareasPorDia[2].add("Capacitacion Java");
            tareasPorDia[2].add("Check-Point");

            tareasPorDia[3] = new ArrayList<>();
            tareasPorDia[3].add("Capacitacion Java");
            tareasPorDia[3].add("Terminar proyectos");

            tareasPorDia[4] = new ArrayList<>();
            tareasPorDia[4].add("Capacitacion Java");
            tareasPorDia[4].add("Revision de proyectos");

            tareasPorDia[5] = new ArrayList<>();
            tareasPorDia[5].add("Ir de compras");
            tareasPorDia[5].add("Ir a la ecuela de Ingles");

            tareasPorDia[6] = new ArrayList<>();
            tareasPorDia[6].add("Disfrutar el dia");

            // Mostramos todas las tareas para cada dia de la semana
            for (int i = 0; i < diasSemanas.length; i++) {
                System.out.println("Tareas para realizar hoy " + diasSemanas[i] + ":");
                List<String> tareasHoy = tareasPorDia[i];
                for (String task : tareasHoy) {
                    System.out.println("- " + task);
                }

                // Espacio entre cada dia y sus tareas
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            }

            /*Obtener las tareas para un día específico (por ejemplo, Martes)
            int realizarTareas = 1; // Índice para Martes
            List<String> tareaHoy = tareasPorDia[realizarTareas];

            System.out.println("Tareas para " + diasSemanas[realizarTareas] + ":");
            for (String tareas : tareaHoy) {
                System.out.println("- " + tareas);
            } */


        }
    }