 class CuentaReceptora extends TipoCuentaBancaria {

        //Creamos el constructor, donde pasamos por parametros, los valores de referencia
    public CuentaReceptora(String titular, float saldo) {
            super(titular, saldo);
        }

     //Ejecutamos el metodo abstracto, para sumar la cantidad recibida
        @Override
        public void transaccion(float cantidadTransferencia) {
            saldo += cantidadTransferencia;
            System.out.println("Transacción recibida exitosa. Nuevo saldo: $" + saldo);
        }

}
