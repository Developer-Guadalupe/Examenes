import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenarNombre {

    public static void main(String[] args) {

        // Creamos la lista de cadenas de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Siwon");
        nombres.add("Yesung");
        nombres.add("Eunhyuk");
        nombres.add("Heechul");

        // Definimos funcion lambda para ordenar la lista de nombres alfabeticamente
        Collections.sort(nombres, (nombre1, nombre2) -> nombre1.compareTo(nombre2));

        // Ejecutamos la lambda
        System.out.println("Nombres en orden: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}

