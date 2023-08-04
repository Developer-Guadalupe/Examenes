import java.util.function.BiFunction;
public class BiFunctionArea {
    public static void main(String[] args) {

        // Definimos la funcion BiFunction para calcular el area del rectangulo
        BiFunction<Integer, Integer, Integer> calculateRectangleArea = (width, height) -> width * height;

        // Definimos las variables de ancho y altura
        int ancho = 5;
        int altura = 10;

        // Ejecutamos la funcion apply de la instancia de BiFunction para calcular el area del retangulo
        int area = calculateRectangleArea.apply(ancho, altura);

        // Imprimimos el resultado
        System.out.println("Area del rectangulo: \nancho " + ancho + " y altura " + altura + "\nes: " + area);
    }

}
