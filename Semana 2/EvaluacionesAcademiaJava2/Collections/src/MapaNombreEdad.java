import java.util.HashMap;
import java.util.Map;
public class MapaNombreEdad {
    public static void main(String[] args) {

        // Crear mapa, para almacenar nomre y edades
        Map<String, Integer> nombresEdades = new HashMap<>();

        // Agregamos elementos al mapa
        nombresEdades.put("Yesung", 36);
        nombresEdades.put("Siwon", 35);
        nombresEdades.put("Donghae", 34);

        // Accedemos al elemento, para ver nombre y edad
        int edadYesung = nombresEdades.get("Yesung");
        System.out.println("La edad de Yesung es: " + edadYesung);

        // Para verificar si existe un elemento, usamos boleean
        boolean existeSiwon = nombresEdades.containsKey("Siwon");
        System.out.println("¿Esta Siwon en el mapa? " + existeSiwon);

        // Ejecutamos el mapa para tener la informacion
        for (Map.Entry<String, Integer> entry : nombresEdades.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println(nombre + " tiene " + edad + " años.");
        }

        // Asi eliminamos un elemento del mapa
        nombresEdades.remove("Donghae");

        // Asi tenemos el tamaño del mapa
        int tamañoMapa = nombresEdades.size();
        System.out.println("El tamaño del mapa es: " + tamañoMapa);

        // Asi eliminamos todos los registros del mapa
        nombresEdades.clear();

        // Con este verificamos que no tenemos elementos en el mapa
        //Nos va a decir que si, porque se ejecuta antes "clear"
        boolean estaVacio = nombresEdades.isEmpty();
        System.out.println("¿El mapa está vacío? " + estaVacio);
    }

}
