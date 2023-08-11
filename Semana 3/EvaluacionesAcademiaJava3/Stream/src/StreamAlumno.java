import java.util.List;
import java.util.stream.Collectors;
public class StreamAlumno {
    public static void main(String[] args) {

        //Creamos una lista con los parametros de la clase Alumno
        List<Alumnos> alumnos = List.of(
                new Alumnos("Yesung", 17, "UPM"),
                new Alumnos("Siwon", 26, "UNAM"),
                new Alumnos("Donghae ", 16, "IPN"),
                new Alumnos("Leeteuk ", 22, "UAM")
        );

        // Creamos un stream referenciando a la lista de alumnos
        List<String> alumnoMayor = alumnos.stream()
                // filter, nos va a ayudar a identificar a los alumnos mayores de 18 años
                .filter(almnos -> almnos.getEdad() > 18)
                //Obtenemos informacion del alumno
                .map(almnos -> almnos.getNombre() + " tiene " + almnos.getEdad() + " años Estudia en la universidad: " + almnos.getUniversidad())
                //Pasame los resultados de la lista
                .collect(Collectors.toList());

        System.out.println("Alumnos mayores de edad: \n" + alumnoMayor);
    }

}