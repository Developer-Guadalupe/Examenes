class CuentaEmisora extends TipoCuentaBancaria {

    // Creamos constructor que recibe: nombre del titular, el saldo inicial  llamadas por clase padre
    public CuentaEmisora(String titular, float saldo) {
        super(titular, saldo);
    }

    //Ejecutamos el metodo abstracto, para realizar transferencia
    @Override
    public void transaccion(float cantidadTransferencia) {
        if (cantidadTransferencia <= saldo) {
            saldo -= cantidadTransferencia;
            System.out.println("Transacción enviada exitosa. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes. Saldo actual: $" + saldo);
        }
    }

}
