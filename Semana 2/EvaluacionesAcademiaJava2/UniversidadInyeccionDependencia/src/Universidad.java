import java.util.Arrays;

public class Universidad {
    public static void main(String[] args) {

        // Creamos el array de materias
        String[] materiasArray = {"Historia", "Matematicas", "Ingles", "Series de fourier"};
        Materias materias = new Materias(materiasArray);

        // Creamos el array de carreras
        String[] carreraArray = {"Ingenieria", "Administracion","Economia"};
        Carrera carrera = new Carrera(carreraArray, materias);

        // Creamos el alumno, y asignamos valores
        Alumno almno1 = new Alumno("Lucero", carrera);
        Alumno almno2 = new Alumno("Patricio", carrera);
        Alumno almno3 = new Alumno("Bob esponja", carrera);

        // Imprimimos la informacion obtenida, junto con las materias
        System.out.println("Alumna: " + almno1.getNombreAlumno()+ "\nCarrera de la alumna: " + almno1.getCarrera().getNombreCarrera()[0]+"\nMaterias de la Carrera: " + Arrays.toString(almno1.getCarrera().getMaterias().getNombreMateria()));
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nAlumno: " + almno2.getNombreAlumno()+ "\nCarrera del alumno: " + almno2.getCarrera().getNombreCarrera()[1]+"\nMaterias de la Carrera: " + Arrays.toString(almno1.getCarrera().getMaterias().getNombreMateria()));
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nAlumno: " + almno3.getNombreAlumno()+ "\nCarrera del alumno: " + almno3.getCarrera().getNombreCarrera()[2]+"\nMaterias de la Carrera: " + Arrays.toString(almno1.getCarrera().getMaterias().getNombreMateria()));

    }
}
