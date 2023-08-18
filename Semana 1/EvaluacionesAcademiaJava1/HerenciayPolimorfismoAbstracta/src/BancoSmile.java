public class BancoSmile {

    public static void main(String[] args) {
        // Crear instancias de diferentes cuentas bancarias
        TipoCuentaBancaria cuenta1 = new CuentaEmisora("Juan Pérez", 2000 );
        TipoCuentaBancaria cuenta2 = new CuentaReceptora("María Gómez", 1500);

        // Realizar transacciones
        cuenta1.transaccion(1000);wi
        cuenta2.transaccion(1000);

        // Mostrar informacion actualizada de las cuentas
        System.out.println("\nDetalles de la cuenta Emisora:");
        cuenta1.mostrarInformacion();

        System.out.println("\nDetalles de la cuenta de Receptora:");
        cuenta2.mostrarInformacion();
    }

}
