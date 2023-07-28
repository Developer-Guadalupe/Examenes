abstract class TipoCuentaBancaria {

    //Creamos nuestras  variables de referencia
    String titular;
    float saldo;

    // Creamos el constructor para pasar por parametros, los valores de referencia recibidos
    public TipoCuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /* Creamos el metodo abstracto para realizar transferencias,este metodo se puede sobreescribir y sera ejecutado
    por las clases hijas y va a definir la logica para cada tipo de cuenta.*/
    public abstract void transaccion(float cantidad);

    //Creamos metodo, donde se puede sobreescribir el metodo
    public void mostrarInformacion() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }


}
