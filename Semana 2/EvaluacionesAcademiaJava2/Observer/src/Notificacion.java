public class Notificacion {
        public static void main(String[] args) {

            //Creamos la variable de referencia
            Compra Compra = new Compra();

            // Creamos observadores (clientes)
            Observer cliente1 = new Cliente("Angela Aguilar");
            Observer cliente2 = new Cliente("Pepe Aguilar");

            // Los clientes se suscriben para recibir las notificaciones de sus compras realizadas
            Compra.agregarObservador(cliente1);
            // Simulamos una compra realizada
            Compra.compraRealizada("Vestido", 350.56);
            // Simulamos otra compra realizada
            Compra.compraRealizada("Zapatos", 400);

            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

            Compra.agregarObservador(cliente2);
            Compra.compraRealizada("Pantalon", 350.56);
            // Simulamos otra compra realizada
            Compra.compraRealizada("Zapatos", 400);

            // Los clientes desactivan las notificaciones de sus compras realizadas
            Compra.eliminarObservador(cliente1);

        }
    }


